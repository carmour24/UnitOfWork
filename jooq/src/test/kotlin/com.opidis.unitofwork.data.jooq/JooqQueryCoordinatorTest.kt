package com.opidis.unitofwork.data.jooq


import com.opidis.unitofwork.data.generated.Tables.TBL1
import com.opidis.unitofwork.data.generated.tables.records.Tbl1Record
import org.jooq.DSLContext
import org.jooq.Query
import org.jooq.SQLDialect
import org.jooq.conf.ParamType
import org.jooq.impl.DSL
import org.jooq.tools.jdbc.MockConnection
import org.jooq.tools.jdbc.MockDataProvider
import org.jooq.tools.jdbc.MockExecuteContext
import org.jooq.tools.jdbc.MockResult
import org.jooq.util.postgres.PostgresDSL
import org.junit.jupiter.api.*
import java.sql.Connection
import java.util.logging.LogManager


internal class JooqQueryCoordinatorTest {
    private var connection: Connection? = null
    private var jooqQueryCoordinator: JooqQueryCoordinator? = null
    private var dslContext: DSLContext? = null
    private var batchSql: Array<String> = emptyArray()
    private var mockPostgres = true

    init {
        System.setProperty("java.util.logging.config.file", "src/test/resources/logging.properties")
        LogManager.getLogManager().readConfiguration()
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun logging() {
    }

    @Disabled("Can't currently figure out how to use the records for batch update query generation with primary key as predicate for each record.")
    @Nested
    inner class UpdateQueries {
        @BeforeEach
        fun setUp() {
            dslContext = dslContext()
            jooqQueryCoordinator = JooqQueryCoordinator(dslContext!!)


            dslContext!!
                    .deleteFrom(TBL1)
                    .execute()

            // Configure data for updates to operate on.
            val insertQuery = dslContext!!
                    .insertQuery(TBL1)

            val record = Tbl1Record()
            record.id = 10
            record.name = "Chris1"

            val record2 = Tbl1Record()
            record2.id = 20
            record2.name = "Yoni1"

            insertQuery.addRecord(record)
            insertQuery.addRecord(record2)

            insertQuery.execute()
        }

        @Test
        fun shouldExecuteQuery() {
            val record = Tbl1Record()
            record.id = 10
            record.name = "Chris"
            // Mark primary key fields as unchanged so that the update command doesn't attempt to update primary key
            TBL1.primaryKey.fields.forEach { primaryKeyField ->
                record.changed(primaryKeyField, false)
            }

            val singleUpdateQuery = dslContext!!
                    .update(TBL1)
                    .set(record)

            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(singleUpdateQuery))

            if (mockPostgres) {
                assert(batchSql.size == 1) {
                    "SQL query count should be 1, rather than ${batchSql.size}"
                }
            }
            assert(affectedCount.get().sum() == 1) {
                "Affected count should be 1, rather than ${affectedCount.get().sum()}"
            }
        }

        // For some reason this only seems to try to execute a single query, should figure out if it is
        // internally translating this to a single execute with multiple bound rows going in. Only one record as
        // affected count returned though.
        @Test
        fun shouldBatchMultipleUpdateQueries2() {
            val record1 = Tbl1Record()
            record1.id = 10
            record1.name = "Chris"
            // Mark primary key fields as unchanged so that the update command doesn't attempt to update primary key
            TBL1.primaryKey.fields.forEach { primaryKeyField ->
                record1.changed(primaryKeyField, false)
            }

            val record2 = Tbl1Record()
            record2.id = 20
            record2.name = "Yoni"

            // Mark primary key fields as unchanged so that the update command doesn't attempt to update primary key
            TBL1.primaryKey.fields.forEach { primaryKeyField ->
                record2.changed(primaryKeyField, false)
            }


            val updateBatch = dslContext!!
                    .batchUpdate(record1, record2)

            assert(updateBatch.size() == 2) {
                "Incorrect batch size, should be 2, not ${updateBatch.size()}"
            }

            val updateCount = updateBatch.execute()

            val rowCount = updateCount.size

            val affectedCount = updateCount.sum()

            assert(rowCount == 2) {
                "Incorrect updated item row count, should have been 2 not $rowCount"
            }

//            assert(batchSql.size == 2) { "Batch size should be 2 for 2 upates not ${batchSql.size}" }
            assert(affectedCount == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
        }

        @Test
        fun shouldBatchMultipleUpdateQueries() {
            val record1 = Tbl1Record()
            record1.id = 10
            record1.name = "Chris"
            // Mark primary key fields as unchanged so that the update command doesn't attempt to update primary key
            TBL1.primaryKey.fields.forEach { primaryKeyField ->
                record1.changed(primaryKeyField, false)
            }

            val query1 = dslContext!!
                    .update(TBL1)
                    .set(record1)

            val record2 = Tbl1Record()
            record2.id = 20
            record2.name = "Yoni"
            // Mark primary key fields as unchanged so that the update command doesn't attempt to update primary key
            TBL1.primaryKey.fields.forEach { primaryKeyField ->
                record2.changed(primaryKeyField, false)
            }

            val query2 = dslContext!!
                    .update(TBL1)
                    .set(record2)

            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(query1, query2))

            assert(batchSql.size == 2) { "Batch size should be 2 for 2 updates not ${batchSql.size}" }
            assert(affectedCount.get().sum() == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
        }
    }

    fun dslContext(dataProviderAction: ((MockExecuteContext) -> Array<out MockResult>)? = null): DSLContext? {
        return if (mockPostgres) {
            val mockDataProvider = MockDataProvider(dataProviderAction ?: {
                batchSql = it.batchSQL()
                println(batchSql.joinToString(separator = "\n"))
                arrayOf(
                        MockResult(batchSql.size)
                )
            })

            connection = MockConnection(mockDataProvider)
            DSL.using(connection, SQLDialect.POSTGRES_10)
        } else {
            PostgresDSL.using("jdbc:postgresql://localhost/postgres", "postgres", "postgres")
        }
    }

    @Nested
    inner class InsertQueries {
        @BeforeEach
        fun setUp() {

            val mockDataProvider = MockDataProvider {
                batchSql = it.batchSQL()
                println(batchSql.joinToString(separator = "\n"))
                arrayOf(
                        MockResult(batchSql.size)
                )
            }

            connection = MockConnection(mockDataProvider)

            dslContext = dslContext {
                batchSql = it.batchSQL()
                println(batchSql.joinToString(separator = "\n"))
                arrayOf(
                        MockResult(it.autoGeneratedKeys())
                )
            }

            jooqQueryCoordinator = JooqQueryCoordinator(dslContext!!)

            dslContext!!
                    .deleteFrom(TBL1)
                    .execute()
        }

        @Test
        fun shouldPerformMultipleInsertsInSingleQuery() {
            val record1 = Tbl1Record()
            record1.id = 11
            record1.name = "Chris"

            val record2 = Tbl1Record()
            record2.id = 21
            record2.name = "Yoni"

            val record3 = Tbl1Record()
            record2.id = 22
            record2.name = "Jason"

            val query = dslContext!!.insertQuery(TBL1)

            query.addRecord(record1)
            query.addRecord(record2)
            query.addRecord(record3)

            val affectedCount = query.execute()
//            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(query1, query2))

//            assert(batchSql.size == 2) { "Batch size should be 2 for 2 updates not ${batchSql.size}" }
            assert(affectedCount == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
        }

        @Test
        fun shouldBatchMultipleInsertQueries() {
            val record1 = Tbl1Record()
            record1.id = 11
            record1.name = "Chris"

            val query1 = dslContext!!
                    .insertInto(TBL1)
                    .set(record1)

            val record2 = Tbl1Record()
            record2.id = 21
            record2.name = "Yoni"

            val query2 = dslContext!!
                    .insertInto(TBL1)
                    .set(record2)

            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(query1, query2))

//            assert(batchSql.size == 2) { "Batch size should be 2 for 2 updates not ${batchSql.size}" }
//            assert(affectedCount.get().size == 2) { "Count of affected entries should be 2" }
            assert(affectedCount.get().sum() == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
        }

        @Test
        @Disabled
        fun shouldBatchMultipleInsertQueries2() {
            val record1 = Tbl1Record()
            record1.id = 11
            record1.name = "Chris"

            val record2 = Tbl1Record()
            record2.id = 21
            record2.name = "Yoni"

            val affectedCount = dslContext!!.batchInsert(record1, record2).execute()

//            assert(batchSql.size == 2) { "Batch size should be 2 for 2 updates not ${batchSql.size}" }
            assert(affectedCount.size == 2) { "Count of affected entries should be 2" }
            assert(affectedCount.sum() == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
        }
    }
}
