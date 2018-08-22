package com.opidis.unitofwork.data.jooq


import com.opidis.unitofwork.data.generated.Tables.TBL1
import com.opidis.unitofwork.data.generated.tables.records.Tbl1Record
import org.apache.logging.log4j.Level
import org.apache.logging.log4j.core.appender.TlsSyslogFrame
import org.jooq.DSLContext
import org.jooq.Log
import org.jooq.tools.jdbc.MockConnection
import org.jooq.tools.jdbc.MockDataProvider
import org.jooq.tools.jdbc.MockResult
import org.jooq.util.postgres.PostgresDSL
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.sql.Connection
import java.util.logging.LogManager
import java.util.logging.Logger
import kotlin.math.log

internal class JooqQueryCoordinatorTest {
    private var connection: Connection? = null
    private var jooqQueryCoordinator: JooqQueryCoordinator? = null
    private var dslContext: DSLContext? = null
    private var batchSql: Array<String> = emptyArray()

    init {
        System.setProperty("java.util.logging.config.file", "src/test/resources/logging.properties")
        LogManager.getLogManager().readConfiguration()
    }

    @BeforeEach
    fun setUp() {

        val mockDataProvider = MockDataProvider {
            batchSql = it.batchSQL()
            println("${batchSql.joinToString(separator = "\n")}")
            arrayOf(
                    MockResult(batchSql.size)
            )
        }

        connection = MockConnection(mockDataProvider)

//        dslContext = DSL.using(connection, SQLDialect.POSTGRES_10)
        dslContext = PostgresDSL.using("jdbc:postgresql://localhost/postgres", "postgres", "password")
        jooqQueryCoordinator = JooqQueryCoordinator(dslContext!!)
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun logging() {
    }

    @Nested
    inner class UpdateQueries {
        @Test
        fun shouldExecuteQuery() {
            val record = Tbl1Record()
            record.id = 10
            record.name = "Chris"

            val singleUpdateQuery = dslContext!!
                    .update(TBL1)
                    .set(record)

            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(singleUpdateQuery))

            assert(batchSql.size == 1)
            assert(affectedCount.sum() == 1)
        }

        @Test
        fun shouldBatchMultipleUpdateQueries2() {
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

//            val affectedCount = jooqQueryCoordinator!!.batchExecute(listOf(query1, query2))
            val affectedCount = dslContext!!
                    .batchUpdate(record1, record2)
                    .execute()
                    .sum()

//            assert(batchSql.size == 2) { "Batch size should be 2 for 2 updates not ${batchSql.size}" }
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
            assert(affectedCount.sum() == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
        }
    }

    @Nested
    inner class InsertQueries {
        @BeforeEach
        fun setUp() {
            dslContext!!
                    .deleteFrom(TBL1)
                    .where(TBL1.ID.`in`(11, 21))
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
            assert(affectedCount.sum() == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
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
            assert(affectedCount.sum() == 2) { "Affected count should be 2 for 2 updates not $affectedCount" }
        }
    }
}
