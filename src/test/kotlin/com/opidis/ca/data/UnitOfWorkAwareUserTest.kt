package com.opidis.ca.data

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class UnitOfWorkAwareUserTest {
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