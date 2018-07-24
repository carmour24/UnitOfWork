package com.opidis.ca.data

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Nested

internal class ObservableUser2Test {
    @Nested
    class Simple {
        private var observableUser: ObservableUser2? = null

        @BeforeEach
        fun setUp() {
            observableUser = ObservableUser2(name = "Chris", address = arrayOf(
                    "Idox Software Ltd",
                    "The Grosvenor Building",
                    "72 Gordon Street",
                    "Glasgow",
                    "G1 3RS",
                    "UK"
            ), onChange = null)
        }

        @AfterEach
        fun tearDown() {
        }

        @Test
        fun getName() {
            assert(observableUser?.name == "Chris")
        }

        @Test
        fun setName() {
            observableUser?.name = "Yoni"
            assert(observableUser?.name == "Yoni")
        }

        @Test
        fun getAddress() {
            assert(observableUser?.address?.size == 6)
        }

        @Test
        fun setAddress() {
            observableUser?.address = arrayOf("Opidis, The Grosvenor Building, 72 Gordon Street, Glasgow, G1 3RS, UK")
            assert(observableUser?.address?.size == 1)
        }
    }

    @Nested
    class OnChangeListener {
        private var observableUser: ObservableUser2? = null
        private var changed = false

        @BeforeEach
        fun setUp() {
            observableUser = ObservableUser2(name = "Chris", address = arrayOf(
                    "Idox Software Ltd",
                    "The Grosvenor Building",
                    "72 Gordon Street",
                    "Glasgow",
                    "G1 3RS",
                    "UK"
            ), onChange = {
                changed = true
            })
        }

        @AfterEach
        fun tearDown() {
            changed = false
        }

        @Test
        fun getName() {
            assert(!changed) {
                "Name has changed"
            }
        }

        @Test
        fun setName() {
            observableUser?.name = "Yoni"
            assert(changed) {
                "Name should have changed!"
            }
        }

        @Test
        fun getAddress() {
            assert(observableUser?.address?.size == 6)
        }

        @Test
        fun setAddress() {
            observableUser?.address = arrayOf("Opidis, The Grosvenor Building, 72 Gordon Street, Glasgow, G1 3RS, UK")
            assert(observableUser?.address?.size == 1)
        }

        @Test
        fun onChangeHandlerIsPassedCorrectEntity() {
            var observedUser: ObservableUser2? = null

            observedUser = ObservableUser2(name = "Chris", address = arrayOf(
                    "Idox Software Ltd",
                    "The Grosvenor Building",
                    "72 Gordon Street",
                    "Glasgow",
                    "G1 3RS",
                    "UK"
            ), onChange = {
                assert(observedUser == it) {
                    "Incorrect entity passed to onChange handler"
                }
            })

            observedUser.name = "Gordon"
        }
    }
}


