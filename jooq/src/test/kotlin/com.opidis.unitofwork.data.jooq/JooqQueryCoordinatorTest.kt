package com.opidis.unitofwork.data.jooq


import com.opidis.unitofwork.data.generated.Tables.TBL1
import com.opidis.unitofwork.data.generated.tables.records.Tbl1Record
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.tools.jdbc.MockConnection
import org.jooq.tools.jdbc.MockDataProvider
import org.jooq.tools.jdbc.MockResult
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.sql.Connection

internal class JooqQueryCoordinatorTest {
    private var connection: Connection? = null
    private var jooqQueryCoordinator: JooqQueryCoordinator? = null
    private var dslContext: DSLContext? = null
    private var batchSql: Array<String> = emptyArray()

    @BeforeEach
    fun setUp() {
       val mockDataProvider = MockDataProvider {
           batchSql = it.batchSQL()
            arrayOf(
                    MockResult(1)
            )
        }

        connection = MockConnection(mockDataProvider)

        dslContext = DSL.using(connection, SQLDialect.POSTGRES_10)
        jooqQueryCoordinator = JooqQueryCoordinator(dslContext!!)
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun shouldExecuteQuery() {
        val record = Tbl1Record()
        record.id = 10
        record.name = "Chris"

        val singleUpdateQuery = dslContext!!
                .update(TBL1)
                .set(record)

        val affectedCount =  jooqQueryCoordinator!!.batchExecute(listOf(singleUpdateQuery))

        assert(batchSql.size == 1)
        assert(affectedCount.sum() == 1)
    }
//    @Test
//    fun shouldBatchMultipleQueries() {
//        val record1 = Tbl1Record()
//        record1.id = 10
//        record1.name = "Chris"
//
//        val record2 = Tbl1Record()
//        record2.id = 20
//        record2.name = "Yoni"
//
//        val affectedCount = dslContext!!
//                .update(TBL1)
//                .set(record1)
//
//        assert(false)
//
//    }
}
