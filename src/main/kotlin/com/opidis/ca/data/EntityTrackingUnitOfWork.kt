package com.opidis.ca.data

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

//val jooqEntityTrackingUnitOfWork = EntityTrackingUnitOfWork(EntityQueryMappingConfiguration(DSL.using("")), JooqQueryCoordinator
//(DSL.using("")))

/**
 * Type alias of UnitOfWork for tracking [Entity] subtypes. This is a convenience to be used in other
 * classes supporting tracking [Entity] changes and persisting those.
 */
typealias EntityTrackingUnitOfWork = UnitOfWork<Entity>

/**
 * Default Unit of Work implementation for tracking changes within [Entity] subclasses which delegates query generation
 * and
 * execution to [queryConfiguration] and [queryCoordinator] respectively.
 *
 * Unit of Work keeps track of changes made to entities within the scope of, for example, a single HTTP POST
 * or GraphQL mutation. Changes are tracked via the various tracker functions ([trackChange], [trackDelete], [trackNew]).
 * These update internal lists of changes. * Changes are batched and call sites for the track methods can be notified
 * via returned [CompletionStage] objects.
 *
 * TODO: Consider combining [QueryMappingConfiguration] and [QueryCoordinator] interfaces to remove the [TQuery] param
 *
 *
 * @param TQuery type of Query which is generated by [queryConfiguration] from tracked entity changes. These queries
 * are executed by the [queryCoordinator].
 *
 */
class DefaultEntityTrackingUnitOfWork<TQuery>(
        private val queryConfiguration: QueryMappingConfiguration<TQuery>,
        private val queryCoordinator: QueryCoordinator<TQuery>
) : UnitOfWork<Entity> {

    private val newEntities = mutableListOf<EntityChangeWrapper>()
    private val changedEntities = mutableListOf<EntityChangeWrapper>()
    private val deletedEntities = mutableListOf<EntityChangeWrapper>()

    private fun trackEntity(tracked: Entity, trackingList: MutableList<EntityChangeWrapper>): CompletionStage<Int> {
        val entityChangeWrapper = EntityChangeWrapper(tracked)
        trackingList += entityChangeWrapper

        // TODO: Add error handling when the throwable, u, is not null.
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

    override fun complete() {
        // TODO: Need to add error handling to this function. Should probably be done in a subclass although maybe
        // providing a query error handling strategy would be more flexible. Having said that, maybe in the
        // coordinator or query mapping is more natural.
        queryCoordinator.transaction {
            // Group all entities by their type so we can batch their updates by type
            // We may be able to get away with just batching all updates in one single batch regardless of type,
            // need to test
            newEntities.groupBy { it.javaClass }
                    // For each entity type create a batch of queries and execute.
                    .forEach {
                        queryCoordinator.batch(
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

    /**
     * Internal class for holding combinations of [CompletableFuture] and [Entity]
     *
     * [trackedEntity] changes are tracked by storing instances of this class in an appropriate collection. Upon
     * persisting these changes the [completableFuture] instance is completed with the update count to allow the call
     * site for tracking to be notified of the success or otherwise of the persistence attempt through the
     * resulting [CompletionStage] produced from [completableFuture] and exposed publicly as [completionStage].
     */
    private class EntityChangeWrapper(val trackedEntity: Entity) {
        private val completableFuture = CompletableFuture<Int>()
        val completionStage: CompletionStage<Int> = completableFuture.minimalCompletionStage()

        fun complete(affectedCount: Int) {
            completableFuture.complete(affectedCount)
        }
    }
}
