package com.opidis.unitofwork.data.jooq


import com.opidis.unitofwork.data.ChangeType
import com.opidis.unitofwork.data.Entity
import com.opidis.unitofwork.data.jooq.EntityQueryMappingConfiguration
import org.jooq.Configuration
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.jooq.impl.DefaultConfiguration
import org.jooq.tools.jdbc.MockConfiguration
import org.jooq.tools.jdbc.MockConnection
import org.jooq.tools.jdbc.MockDataProvider
import org.jooq.tools.jdbc.MockResult
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.sql.Connection

internal class EntityQueryMappingConfigurationTest {
    private var entityQueryMappingConfiguration : EntityQueryMappingConfiguration? = null
    private var connection: Connection? = null

    @BeforeEach
    fun setUp() {

        val jooqConfiguration: Configuration = DefaultConfiguration()
        val mockConfiguration:Configuration = MockConfiguration(jooqConfiguration, null)

        val mockDataProvider = MockDataProvider {
            arrayOf(
                    MockResult(1)
            )
        }

        connection = MockConnection(mockDataProvider)

        val dslContext = DSL.using(connection, SQLDialect.POSTGRES_10)
        entityQueryMappingConfiguration = EntityQueryMappingConfiguration(dslContext)
    }

    @AfterEach
    fun tearDown() {
    }

    class Entity1(val Id: Int, name: String, val foreignName: Entity2? = null) : Entity

    class Entity2(val Id: Int, foreignName: String) : Entity

    @Test
    fun mapQueryForNewEntity1ToTlb1Record() {
        val query = entityQueryMappingConfiguration!!.queryFor(ChangeType.Insert, Entity1(10, name = "Chris"))

        assert(query.bindValues.elementAt(0) == 10) {
            "First parameter to query should be 10"
        }

        assert(query.bindValues.elementAt(1) == "Chris") {
            "Second parameter to query should be 'Chris'"
        }

        assert(query.sql.contains("insert.*Tlb1", ignoreCase = true))
    }
}