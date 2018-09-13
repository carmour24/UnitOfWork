package com.opidis.unitofwork.data

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

typealias TransactionCompletion = () -> CompletableFuture<Void>

interface QueryCoordinator<in TQuery, TExecutionInfo: ExecutionInfo> {
    fun transaction(transactional: (TExecutionInfo?) -> Unit) : TransactionCompletion
    fun batchExecute(queries: List<TQuery>, executionInfo: TExecutionInfo? = null): CompletionStage<IntArray>
}