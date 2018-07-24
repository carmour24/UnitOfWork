package com.opidis.ca.data

//import reactor.core.publisher.Mono
import org.jooq.DSLContext
import org.reactivestreams.Publisher

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
    fun queryFor(changeType: ChangeType, entity: Entity, dslContext: DSLContext): org.jooq.Query {

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


fun main() {
    val entityTrackingUnitOfWork: EntityTrackingUnitOfWork
    val entity = UnitOfWorkAwareUser(name = "Chris", address = arrayOf(
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

