package com.opidis.ca.data

import org.jooq.DSLContext
import org.jooq.Query
import org.reactivestreams.Publisher
import java.util.concurrent.CompletableFuture
//import reactor.core.publisher.Mono
import kotlin.properties.Delegates

/**
 * Unit of work pattern
 *
 * A Unit of Work interface to track changes made to entities within an operation,
 * for example within a single HTTP request. [Tracked] will usually be the base type of entities being tracked.
 * All changes will be recorded and persisted to the database at one time within a single transaction.
 * This will commit all changes quickly without requiring a long running connection.
 */
interface UnitOfWork<in Tracked> {
    /**
     * Adds an entity to the internal tracking of changes to be later persisted to the database by calling [complete].
     * @return Returns a mono with the count of rows affected once the tracked entity's changes have been persisted.
     */
    fun trackChange(tracked: Tracked): Publisher<Int>

    /**
     * Adds an entity to the internal tracking of changes to be later persisted to the database by calling [complete].
     * @return Returns a mono with the count of rows affected once the tracked entity's changes have been persisted.
     */
    fun trackNew(tracked: Tracked): Publisher<Int>


    /**
     * Adds an entity to the internal tracking of changes to be later persisted to the database by calling [complete].
     * @return Returns a mono with the count of rows affected once the tracked entity's changes have been persisted.
     */
    fun trackDelete(tracked: Tracked): Publisher<Int>

    /**
     * Persist all changes recorded with [trackChange] to the database within a single transaction.
     */
    fun complete()
}


class Configuration() {
    fun queryFor(changeType: ChangeType, entity: Entity, dslContext: DSLContext): Query {

//        return dslContext.batchUpdate(mutableListOf<UpdateableRecord<Entity>>(null)).

//        return dslContext.update()

        return dslContext.query("")
    }
}

enum class ChangeType {
    Insert,
    Update,
    Delete,
    Select
}

interface Entity


open class User(open val name: String, open val address: Array<String>): Entity

fun main() {
    val entityTrackingUnitOfWork: EntityTrackingUnitOfWork
    val entity = ObservableUser(name = "Chris", address = arrayOf(
            "Idox Software Ltd",
            "The Grosvenor Building",
            "72 Gordon Street",
            "Glasgow",
            "G1 3RS",
            "UK"
        )
    )


    print("Name: ${entity.name}, Address: ${entity.address}")
}

fun <T>makeObservable(initialValue: T, entity: Entity, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? = null) =
    Delegates.observable(initialValue = initialValue) {
        _, _, _ ->
        entityTrackingUnitOfWork?.trackChange(tracked = entity)
    }

class ObservableUser(name: String, address: Array<String>, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? = null) : Entity {
    val name: String by makeObservable("", this, entityTrackingUnitOfWork)
    val address: Array<String> by makeObservable(emptyArray(), this, entityTrackingUnitOfWork)
}

class EntityTrackingUnitOfWork(private val dslContext: DSLContext, private val queryConfiguration: com.opidis.ca.data.Configuration): UnitOfWork<Entity> {
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