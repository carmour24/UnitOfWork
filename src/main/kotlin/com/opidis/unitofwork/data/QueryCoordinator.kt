package com.opidis.unitofwork.data

interface QueryCoordinator<TQuery> {
    fun transaction(transactional: () -> Unit)
    fun batchExecute(queries: List<TQuery>): IntArray
}