package com.opidis.unitofwork.data

/**
 * A configuration to map changed entities (new, updated, deleted) to a corresponding Query, [TQuery] which can be
 * executed to persist the changes to a suitable Database, for example.
 */
interface QueryMappingConfiguration<TQuery> {
    /**
     * Produce a query to update the [entity] in the database for this [changeType].
     */
    fun queryFor(changeType: ChangeType, entity: Entity): TQuery
}