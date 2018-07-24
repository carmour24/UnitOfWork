package com.opidis.ca.data

import org.jooq.DSLContext
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

class EntityTrackingUnitOfWork(
        private val dslContext: DSLContext,
        private val queryConfiguration: EntityQueryMappingConfiguration
) : UnitOfWork<Entity> {

    private val newEntities = mutableListOf<EntityChangeWrapper>()
    private val changedEntities = mutableListOf<EntityChangeWrapper>()
    private val deletedEntities = mutableListOf<EntityChangeWrapper>()

    override fun trackNew(tracked: Entity): CompletionStage<Int> {
        val entityChangeWrapper = EntityChangeWrapper(tracked)
        newEntities.add(entityChangeWrapper)

        entityChangeWrapper.completionStage.whenComplete { _, u -> newEntities.remove(entityChangeWrapper) }

        return entityChangeWrapper.completionStage
    }

    override fun trackDelete(tracked: Entity): CompletionStage<Int> {
        val entityChangePublisher = EntityChangeWrapper(tracked)
        deletedEntities.add(entityChangePublisher)
        return entityChangePublisher.completionStage
    }

    override fun trackChange(tracked: Entity): CompletionStage<Int> {
        val entityChangePublisher = EntityChangeWrapper(tracked)
        changedEntities.add(entityChangePublisher)
        return entityChangePublisher.completionStage
    }

    /**
     * Commit all tracked entity changes within a single commit.
     */
    override fun complete() {
        dslContext.connection {
            dslContext.transaction { ->
                // Group all entities by their type so we can batch their updates by type

                newEntities.groupBy { it.javaClass }
                        // For each class type create a batch of
                        .forEach {
                            dslContext.batch(
                                    it.value.map {
                                        queryConfiguration.queryFor(changeType = ChangeType.Insert, entity = it, dslContext = dslContext)
                                    }
                            )
                        }
            }
        }
    }

    class EntityChangeWrapper(val changedEntity: Entity) {
        private val completableFuture = CompletableFuture<Int>()
        val completionStage: CompletionStage<Int> = completableFuture.minimalCompletionStage()

        fun complete(affectedCount: Int) {
            completableFuture.complete(affectedCount)
        }
    }
}
