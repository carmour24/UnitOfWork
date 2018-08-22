package com.opidis.unitofwork.data.jooq


import com.opidis.unitofwork.data.ChangeType
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.tools.jdbc.MockConnection
import org.jooq.tools.jdbc.MockDataProvider
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.sql.Connection

internal class EntityQueryMappingConfigurationTest {
    private var entityQueryMappingConfiguration: EntityQueryMappingConfiguration? = null
    private var connection: Connection? = null

    @BeforeEach
    fun setUp() {
       val mockDataProvider = MockDataProvider {
            emptyArray()
        }

        connection = MockConnection(mockDataProvider)

        val dslContext = DSL.using(connection, SQLDialect.POSTGRES_10)
        entityQueryMappingConfiguration = EntityQueryMappingConfiguration(dslContext)
    }

    @AfterEach
    fun tearDown() {
    }


    @Test
    @Disabled
    fun mapQueryForNewEntity1ToTbl1Record() {
        val entity = Entity1(10, "Chris")
        val query = entityQueryMappingConfiguration!!.queryFor(ChangeType.Insert, entities = listOf(entity))

        assert(query.bindValues.filterNotNull().size == 2) {
            "Two parameters should be specified"
        }

        assert(query.bindValues.elementAt(0) == 10) {
            "Parameter list should contain '10'"
        }

        assert(query.bindValues.any { it == "Chris" }) {
            "Parameter list should contain 'Chris'"
        }

        assert(query.sql.contains(Regex("^insert\\s+into.*tbl1.*", RegexOption.IGNORE_CASE)))
    }

    @Test
    @Disabled
    fun mapQueryForUpdatedEntity1ToTbl1Record() {
        val entity = Entity1(10, "Chris")
        val query = entityQueryMappingConfiguration!!.queryFor(ChangeType.Update, entities = listOf(entity))

        assert(query.bindValues.filterNotNull().size == 2) {
            "Two parameters should be specified"
        }

        assert(query.bindValues.elementAt(0) == 10) {
            "Parameter list should contain '10'"
        }

        assert(query.bindValues.any { it == "Chris" }) {
            "Parameter list should contain 'Chris'"
        }

        assert(query.sql.contains(Regex("^update.*tbl1.*", RegexOption.IGNORE_CASE)))
    }

    @Test
    @Disabled
    fun mapQueryForDeletedEntity1ToTbl1Record() {
        val entity = Entity1(10, "Chris")
        val query = entityQueryMappingConfiguration!!.queryFor(ChangeType.Delete, entities = listOf(entity))

        assert(query.bindValues.size == 1) {
            "One parameter should be specified"
        }

        assert(query.bindValues.elementAt(0) == 10) {
            "Parameter list should contain '10'"
        }

        assert(query.sql.contains(Regex("^delete\\s+from.*tbl1.*", RegexOption.IGNORE_CASE)))
    }
}
