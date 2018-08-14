package com.opidis.unitofwork.data.jooq

import com.opidis.unitofwork.data.ChangeType
import com.opidis.unitofwork.data.Entity
import com.opidis.unitofwork.data.QueryMappingConfiguration
import com.opidis.unitofwork.data.generated.Tables.TBL1
import com.opidis.unitofwork.data.generated.tables.records.Tbl1Record
import org.jooq.*

/**
 * Custom
 *
 * TODO: Consider batching generation of both insert and delete queries together by table to minimize data sent to DB rather than the current approach of batching execution which works on statement per record.
 *
 */
class EntityQueryMappingConfiguration(private val dslContext: DSLContext) : QueryMappingConfiguration<Batch> {
    override fun <T : Entity> queryFor(changeType: ChangeType, entities: List<T>): List<Batch> {
        val entity = entities.first()
        return when (entities) {
            entities as? List<Entity1> -> listOf(queryFor(entities, changeType = changeType))
            else -> throw Exception("Unsupported entity type supplied for query generation")
        }
    }

    private fun queryFor(entities: List<Entity1>, changeType: ChangeType): Batch {
        val entity = entities.first()
        // Map user record from user entity using the built in Jooq mapper functionality
        val userRecord = Tbl1Record()
        userRecord.from(entity)

        return dslContext.batch(
                when (changeType) {
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
                        // Example of using DSL to create a query. We can use this for writing complicated queries by hand.
                        // Can use "with" to make writing the query more natural (e.g. use ID directly rather than TBL1.ID)
                        with(TBL1) {
                            dslContext
                                    .delete(TBL1)
                                    .where(TBL1.ID.eq(entity.Id))
                        }
                    }
                })
    }
}
