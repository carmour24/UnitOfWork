package com.opidis.ca.data

import org.jooq.DSLContext
import org.jooq.Query

interface QueryMappingConfiguration<TQuery> {
    fun queryFor(changeType: ChangeType, entity: Entity): TQuery
}

class EntityQueryMappingConfiguration(private val dslContext: DSLContext) : QueryMappingConfiguration<Query> {
    override fun queryFor(changeType: ChangeType, entity: Entity): Query {

//        return dslContext.batchUpdate(mutableListOf<UpdateableRecord<Entity>>(null)).

//        return dslContext.update()

        return dslContext.query("")
    }
}