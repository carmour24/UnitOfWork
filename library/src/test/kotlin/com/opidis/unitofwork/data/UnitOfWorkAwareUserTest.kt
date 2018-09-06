package com.opidis.unitofwork.data

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

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
        private var unitOfWork: EntityTrackingUnitOfWork? = null
        private var unitOfWorkAwareUser: UnitOfWorkAwareUser? = null
        private var queryConfiguration: MockQueryConfiguration? = null

        class MockQuery

        class MockQueryConfiguration : QueryMappingConfiguration<MockQuery> {
            val listOfUserChanges = ArrayList<UnitOfWorkAwareUser>()
            val listOfUserAdditions = ArrayList<UnitOfWorkAwareUser>()
            val listOfUserDeletions = ArrayList<UnitOfWorkAwareUser>()
            override fun <T : Entity> queryFor(changeType: ChangeType, entities: List<T>): MockQuery {
                entities.forEach { entity ->
                    print("$entity ${entity.javaClass} ${entity.javaClass.kotlin}")

                    val entityAsUser = entity as UnitOfWorkAwareUser

                    when (changeType) {
                        ChangeType.Delete -> listOfUserDeletions.add(entityAsUser)
                        ChangeType.Insert -> listOfUserAdditions.add(entityAsUser)
                        ChangeType.Update -> listOfUserChanges.add(entityAsUser)
                    }
                }
                return MockQuery()
            }
        }

        private fun getQueryCoordinatorFor(numberOfResults: Int) = object : QueryCoordinator<MockQuery, ExecutionInfo> {
            override fun transaction(transactional: () -> Unit) {
                // Execute the body of the transaction, e.g. query generation and execution.
                transactional()
            }

            override fun batchExecute(queries: List<MockQuery>, executionInfo: ExecutionInfo?):
                    CompletionStage<IntArray> {
               val resultsFuture = CompletableFuture<IntArray>()
                resultsFuture.complete(IntArray(numberOfResults) { 1 })
                return resultsFuture
            }
        }

        @BeforeEach
        fun setUp() {
            val mockQueryConfiguration = MockQueryConfiguration()

            queryConfiguration = mockQueryConfiguration

            unitOfWork = DefaultEntityTrackingUnitOfWork(
                    queryConfiguration = mockQueryConfiguration,
                    queryCoordinator = getQueryCoordinatorFor(1)
            )

            unitOfWorkAwareUser = UnitOfWorkAwareUser(name = "Chris", address = arrayOf(
                    "Idox Software Ltd",
                    "The Grosvenor Building",
                    "72 Gordon Street",
                    "Glasgow",
                    "G1 3RS",
                    "UK"
            ), entityTrackingUnitOfWork = unitOfWork)
        }

        @AfterEach
        fun tearDown() {
        }

        @Test
        fun getName() {
            assert(unitOfWorkAwareUser?.name == "Chris")
        }

        @Test
        fun listOfChangesShouldBeZeroBeforeChangesMade() {
            unitOfWorkAwareUser?.name = "Gordon"
            assert(unitOfWorkAwareUser?.name == "Gordon")

            assert(queryConfiguration?.listOfUserChanges?.size == 0) {
                "List of user changes should be zero before modifying data"
            }
        }

        @Test
        fun setName() {
            unitOfWorkAwareUser?.name = "Gordon"
            assert(unitOfWorkAwareUser?.name == "Gordon")

            // We need to perform complete to get the query generation to occur and have the changes propagated to
            // the mock QueryConfiguration object.
            unitOfWork?.complete()

            assert(queryConfiguration?.listOfUserChanges?.size == 1) {
                "${queryConfiguration?.listOfUserChanges?.size} user change entries were made when 1 entry should " +
                        "have been made"
            }
            assert(queryConfiguration?.listOfUserChanges?.contains(unitOfWorkAwareUser) == true)
        }

        @Test
        fun trackDeletion() {
            // Track deletion of the unit of work aware user entity
            unitOfWork?.trackDelete(unitOfWorkAwareUser!!)

            // We need to perform complete to get the query generation to occur and have the changes propagated to
            // the mock QueryConfiguration object.
            unitOfWork?.complete()

            assert(queryConfiguration?.listOfUserDeletions?.size == 1) {
                "${queryConfiguration?.listOfUserDeletions?.size} user change entries were made when 1 entry should " +
                        "have been " +
                        "made"
            }
            assert(queryConfiguration?.listOfUserDeletions?.contains(unitOfWorkAwareUser) == true)
        }

        @Test
        fun trackAddition() {
            // Track deletion of the unit of work aware user entity
            unitOfWork?.trackNew(unitOfWorkAwareUser!!)

            // We need to perform complete to get the query generation to occur and have the changes propagated to
            // the mock QueryConfiguration object.
            unitOfWork?.complete()

            assert(queryConfiguration?.listOfUserAdditions?.size == 1) {
                "${queryConfiguration?.listOfUserAdditions?.size} user change entries were made when 1 entry should " +
                        "have been " +
                        "made"
            }

            assert(queryConfiguration?.listOfUserAdditions?.contains(unitOfWorkAwareUser) == true)
        }

        @Test
        fun getAddress() {
            assert(unitOfWorkAwareUser?.address?.size == 6)
        }
    }
}