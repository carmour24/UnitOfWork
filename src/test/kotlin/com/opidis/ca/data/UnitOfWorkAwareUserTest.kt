package com.opidis.ca.data

import org.jooq.DSLContext
import org.jooq.SQLDialect
import org.jooq.impl.DSL
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

internal class UnitOfWorkAwareUserTest {
    @Nested
    class WithNoTracking {
        private var unitOfWorkAwareUser: UnitOfWorkAwareUser? = null

        @BeforeEach
        fun setUp() {
            unitOfWorkAwareUser = UnitOfWorkAwareUser(name = "Chris", address = arrayOf(
                    "Idox Software Ltd",
                    "The Grosvenor Building",
                    "72 Gordon Street",
                    "Glasgow",
                    "G1 3RS",
                    "UK"
            ))
        }

        @AfterEach
        fun tearDown() {
        }

        @Test
        fun getName() {
            assert(unitOfWorkAwareUser?.name == "Chris")
        }

        @Test
        fun getAddress() {
            assert(unitOfWorkAwareUser?.address?.size == 6)
        }
    }

    @Nested
    class WithUnitOfWork {
        private var unitOfWork: UnitOfWork<UnitOfWorkAwareUser>? = null
        private var unitOfWorkAwareUser: UnitOfWorkAwareUser? = null

        @BeforeEach
        fun setUp() {
//            val dslContext = DSL.using(SQLDialect.POSTGRES_10)
//            val queryCoordinator
//
//            unitOfWork = EntityTrackingUnitOfWork(queryConfiguration = EntityQueryMappingConfiguration(dslContext), )
//
//            unitOfWorkAwareUser = UnitOfWorkAwareUser(name = "Chris", address = arrayOf(
//                    "Idox Software Ltd",
//                    "The Grosvenor Building",
//                    "72 Gordon Street",
//                    "Glasgow",
//                    "G1 3RS",
//                    "UK"
//            ))
        }

        @AfterEach
        fun tearDown() {
        }

        @Test
        fun getName() {
            assert(unitOfWorkAwareUser?.name == "Chris")
        }

        @Test
        fun getAddress() {
            assert(unitOfWorkAwareUser?.address?.size == 6)
        }
    }
}