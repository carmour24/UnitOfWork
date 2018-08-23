package com.opidis.unitofwork.data.jooq

import com.opidis.unitofwork.data.generated.Tables.TBL1
import com.opidis.unitofwork.data.generated.tables.records.Tbl1Record
import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.tools.jdbc.MockConnection
import org.jooq.tools.jdbc.MockDataProvider
import org.jooq.tools.jdbc.MockResult
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.sql.Connection
import java.util.logging.LogManager

internal class JooqQueryExtensionsTest {
    private var connection: Connection? = null
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
            println(batchSql.joinToString(separator = "\n"))
            arrayOf(
                    MockResult(batchSql.size)
            )
        }

        connection = MockConnection(mockDataProvider)
        dslContext = DSL.using(connection, SQLDialect.POSTGRES_10)
    }

    @Test
    fun replaceNamedSqlParamsWithNumberedParams() {
        val sql = "insert into table1 (n1, n2, n3 ,n4, n5) values (:1, :2, :3, :4, :5) (:6, :7, :8, :9, :10)" +
                "returning table1.id"

        val sqlWithReplacedParams = com.opidis.unitofwork.data.jooq.replaceNamedSqlParamsWithNumberedParams(sql, 5)

        val regexForMatchingNumberedParam = Regex("\\$\\d+", option = RegexOption.MULTILINE)
        val allMatches = regexForMatchingNumberedParam.findAll(sqlWithReplacedParams)

        assert(allMatches.count { it.groups[0]!!.value == "$1" } == 2)
        assert(allMatches.count { it.groups[0]!!.value == "$2" } == 2)
        assert(allMatches.count { it.groups[0]!!.value == "$3" } == 2)
        assert(allMatches.count { it.groups[0]!!.value == "$4" } == 2)
        assert(allMatches.count { it.groups[0]!!.value == "$5" } == 2)
        // Only values between 1 and 5, matching the above query params should be in the substituted sql string
        assert(!allMatches.any {it.groups[0]!!.value == ("0")})
        assert(!allMatches.any {it.groups[0]!!.value == ("6")})
    }

    @Test
    fun shouldReplaceColonWithDollarForNumberedParameters() {
        val record1 = Tbl1Record()
        record1.id = 11
        record1.name = "Chris"

        val record2 = Tbl1Record()
        record2.id = 21
        record2.name = "Yoni"

        val record3 = Tbl1Record()
        record3.id = 31
        record3.name = "Gordon"

        val record4 = Tbl1Record()
        record4.id = 41
        record4.name = "Jason"

        val record5 = Tbl1Record()
        record5.id = 51
        record5.name = "Gordon"

        val record6 = Tbl1Record()
        record6.id = 61
        record6.name = "Jason"

        val query = dslContext!!.insertInto(TBL1).columns(TBL1.NAME, TBL1.FOREIGN_NAME)
                .values(record1.name, record1.foreignName)
                .values(record2.name, record2.foreignName)
                .values(record3.name, record3.foreignName)
                .values(record4.name, record4.foreignName)
                .values(record5.name, record5.foreignName)
                .values(record6.name, record6.foreignName)

        val sql = query.getSqlWithNumberedParams(2)

        assert(sql.contains("$")) { "SQL should have \$n param numbering" }
        assert(!sql.contains(":")) { "SQL should not have :n param numbering" }
    }
}
