package com.opidis.ca.data

import org.jooq.DSLContext

class EntityQueryMappingConfiguration() {
    fun queryFor(changeType: ChangeType, entity: Entity, dslContext: DSLContext): org.jooq.Query {

//        return dslContext.batchUpdate(mutableListOf<UpdateableRecord<Entity>>(null)).

//        return dslContext.update()

        return dslContext.query("")
    }
}