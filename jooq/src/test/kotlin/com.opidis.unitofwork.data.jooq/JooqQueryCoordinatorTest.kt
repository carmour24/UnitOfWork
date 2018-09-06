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

    @Nested
    inner class UpdateQueries {
        @BeforeEach
        fun setUp() {
            dslContext = if (mockPostgres) {
                val mockDataProvider = MockDataProvider {
                    batchSql = it.batchSQL()
                    println(batchSql.joinToString(separator = "\n"))
                    arrayOf(
                            MockResult(batchSql.size)
                    )
                }

                connection = MockConnection(mockDataProvider)
                DSL.using(connection, SQLDialect.POSTGRES_10)
            } else {
                PostgresDSL.using("jdbc:postgresql://localhost/postgres", "postgres", "postgres")
            }
            jooqQueryCoordinator = JooqQueryCoordinator(dslContext!!)


            dslContext!!
                    .deleteFrom(TBL1)
                    .execute()
        }

        @Test
        fun shouldExecuteQuery() {
            val record = Tbl1Record()
            record.id = 10
            record.name = "Chris"

            val singleUpdateQuery = dslContext!!
                    .update(TBL1)
                    .set(record)

            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(singleUpdateQuery))

            if (mockPostgres) {
                assert(batchSql.size == 1) {
                    "Value should be 1, rather than ${batchSql.size}"
                }
            }
            assert(affectedCount.get().sum() == 1) {
                "Value should be 1, rather than ${affectedCount.get().sum()}"
            }
        }

        // For some reason this only seems to try to execute a single query, should figure out if it is
        // internally translating this to a single execute with multiple bound rows going in. Only one record as
        // affected count returned though.
        @Disabled
        @Test
        fun shouldBatchMultipleUpdateQueries2() {
            val record1 = Tbl1Record()
            record1.id = 10
            record1.name = "Chris"

            val record2 = Tbl1Record()
            record2.id = 20
            record2.name = "Yoni"

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

            val query1 = dslContext!!
                    .update(TBL1)
                    .set(record1)

            val record2 = Tbl1Record()
            record2.id = 20
            record2.name = "Yoni"

            val query2 = dslContext!!
                    .update(TBL1)
                    .set(record2)

            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(query1, query2))

            assert(batchSql.size == 2) { "Batch size should be 2 for 2 updates not ${batchSql.size}" }
            assert(affectedCount.get().sum() == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
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

//            dslContext = DSL.using(connection, SQLDialect.POSTGRES_10)
            dslContext = PostgresDSL.using("jdbc:postgresql://localhost/postgres", "postgres", "postgres")
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

            val query = dslContext!!.insertQuery(TBL1)

            query.addRecord(record1)
            query.addRecord(record2)

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
