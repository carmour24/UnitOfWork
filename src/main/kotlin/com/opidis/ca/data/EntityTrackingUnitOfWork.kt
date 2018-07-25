package com.opidis.ca.data

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

//val jooqEntityTrackingUnitOfWork = EntityTrackingUnitOfWork(EntityQueryMappingConfiguration(DSL.using("")), JooqQueryCoordinator
//(DSL.using("")))


class EntityTrackingUnitOfWork<TQuery>(
        private val queryConfiguration: QueryMappingConfiguration<TQuery>,
        queryCoordinator: QueryCoordinator<TQuery>
) : UnitOfWork<Entity>, QueryCoordinator<TQuery> by queryCoordinator {

    private val newEntities = mutableListOf<EntityChangeWrapper>()
    private val changedEntities = mutableListOf<EntityChangeWrapper>()
    private val deletedEntities = mutableListOf<EntityChangeWrapper>()

    private fun trackEntity(tracked: Entity, trackingList: MutableList<EntityChangeWrapper>): CompletionStage<Int> {
        val entityChangeWrapper = EntityChangeWrapper(tracked)
        trackingList += entityChangeWrapper

        entityChangeWrapper.completionStage.whenComplete { _, u -> trackingList.remove(entityChangeWrapper) }

        return entityChangeWrapper.completionStage
    }

    override fun trackNew(tracked: Entity): CompletionStage<Int> {
        return trackEntity(tracked, newEntities)
    }

    override fun trackDelete(tracked: Entity): CompletionStage<Int> {
        return trackEntity(tracked, deletedEntities)
    }

    override fun trackChange(tracked: Entity): CompletionStage<Int> {
        return trackEntity(tracked, changedEntities)
    }

    /**
     * Commit all tracked entity changes within a single commit batching where possible.
     */
    override fun complete() {
        transaction {
            // Group all entities by their type so we can batch their updates by type
            // We may be able to get away with just batching all updates in one single batch regardless of type,
            // need to test
            newEntities.groupBy { it.javaClass }
                    // For each entity type create a batch of queries and execute.
                    .forEach {
                        batch(
                                it.value.map {
                                    queryConfiguration.queryFor(
                                            changeType = ChangeType.Insert,
                                            entity = it.trackedEntity
                                    )
                                }
                        )
                                .forEachIndexed { index, affectedCount ->
                                    // Take each result from the batch update/insert/delete and complete the
                                    // associated EntityChangeWrapper which will use its completion stage to
                                    // notify any interested parties, e.g. to ensure an update was performed.
                                    newEntities[index].complete(affectedCount)
                                }
                    }
        }
    }

    private class EntityChangeWrapper(val trackedEntity: Entity) {
        private val completableFuture = CompletableFuture<Int>()
        val completionStage: CompletionStage<Int> = completableFuture.minimalCompletionStage()

        fun complete(affectedCount: Int) {
            completableFuture.complete(affectedCount)
        }
    }
}
