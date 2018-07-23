package com.opidis.ca.data

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ObservableUserTest {
    private var observableUser: ObservableUser? = null

    @BeforeEach
    fun setUp() {
        observableUser = ObservableUser(name = "Chris", address = arrayOf(
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
        assert(observableUser?.name == "Chris")
    }

    @Test
    fun getAddress() {
        assert(observableUser?.address?.size == 6)
    }
}