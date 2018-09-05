package com.opidis.unitofwork.data

import java.util.concurrent.CompletionStage

interface QueryCoordinator<in TQuery> {
    fun transaction(transactional: () -> Unit)
    fun batchExecute(queries: List<TQuery>): CompletionStage<IntArray>
}