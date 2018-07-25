package com.opidis.ca.data

interface QueryCoordinator<TQuery> {
    fun transaction(transactional: () -> Unit)
    fun batch(queries: List<TQuery>): IntArray
}