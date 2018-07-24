package com.opidis.ca.data

import java.util.concurrent.CompletionStage
import java.util.concurrent.Flow

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
    fun trackChange(tracked: Tracked): CompletionStage<Int>

    /**
     * Adds an entity to the internal tracking of changes to be later persisted to the database by calling [complete].
     * @return Returns a mono with the count of rows affected once the tracked entity's changes have been persisted.
     */
    fun trackNew(tracked: Tracked): CompletionStage<Int>


    /**
     * Adds an entity to the internal tracking of changes to be later persisted to the database by calling [complete].
     * @return Returns a mono with the count of rows affected once the tracked entity's changes have been persisted.
     */
    fun trackDelete(tracked: Tracked): CompletionStage<Int>

    /**
     * Persist all changes recorded with [trackChange] to the database within a single transaction.
     */
    fun complete()
}


