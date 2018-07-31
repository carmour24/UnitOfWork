package com.opidis.unitofwork.data.jooq

import com.opidis.unitofwork.data.ChangeType
import com.opidis.unitofwork.data.Entity
import com.opidis.unitofwork.data.QueryMappingConfiguration
import com.opidis.unitofwork.data.generated.Tables.TBL1
import com.opidis.unitofwork.data.generated.tables.records.Tbl1Record
import org.jooq.*

/**
 *
 */
class EntityQueryMappingConfiguration(private val dslContext: DSLContext) : QueryMappingConfiguration<Query> {
    override fun queryFor(changeType: ChangeType, entity: Entity): Query {
        val entity1 = entity as Entity1

        // Map user record from user entity
        val userRecord = Tbl1Record()
        userRecord.from(entity1)

        return when (changeType) {
            ChangeType.Insert -> {
                val query = dslContext.insertQuery(TBL1)
                query.addRecord(userRecord)
                query
            }
            ChangeType.Update -> {
                val query = dslContext.updateQuery(TBL1)
                query.setRecord(userRecord)
                query
            }
            ChangeType.Delete -> {
                // Use
                with(TBL1) {
                    dslContext
                            .delete(TBL1)
                            .where(ID.eq(entity1.Id))
                }
            }
        }
    }
}
