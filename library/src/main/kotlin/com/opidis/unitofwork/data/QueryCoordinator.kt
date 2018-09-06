package com.opidis.unitofwork.data

import java.util.concurrent.CompletionStage

interface QueryCoordinator<in TQuery, TExecutionInfo: ExecutionInfo> {
    fun transaction(transactional: (TExecutionInfo?) -> Unit)
    fun batchExecute(queries: List<TQuery>, executionInfo: TExecutionInfo? = null): CompletionStage<IntArray>
}