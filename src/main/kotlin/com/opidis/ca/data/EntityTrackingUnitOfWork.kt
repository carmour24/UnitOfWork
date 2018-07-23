package com.opidis.ca.data

import org.jooq.DSLContext
import org.reactivestreams.Publisher

class EntityTrackingUnitOfWork(
        private val dslContext: DSLContext,
        private val queryConfiguration: Configuration
) : UnitOfWork<Entity> {

    private val newEntities = mutableListOf<Entity>()
    private val changedEntities = mutableListOf<Entity>()
    private val deletedEntities = mutableListOf<Entity>()

    override fun trackNew(tracked: Entity): Publisher<Int> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun trackDelete(tracked: Entity): Publisher<Int> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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

    override fun trackChange(tracked: Entity): Publisher<Int> {
        // TODO: Create a wrapper that contains Entity and returns a Publisher with the count of the
        // affected rows as had with Query tracking UoW
        changedEntities.add(tracked)
        return Publisher { 0 }
    }
}