package com.opidis.unitofwork.data

import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

/**
 * Type alias for convenience for the lambda to be invoked within the calling [UnitOfWork] whenever the work is complete.
 * This [TransactionCompletion] should contain an action to commit or rollback the created transaction.
 */
typealias TransactionCompletion = () -> CompletableFuture<Void>

interface QueryCoordinator<in TQuery, TExecutionInfo : ExecutionInfo> {
    /**
     * Create a transaction and perform the action specified in [transactional] passing any required execution
     * information, [TExecutionInfo]. Returns [TransactionCompletion] to be invoked within the calling [UnitOfWork]
     * whenever the work is complete. This [TransactionCompletion] should contain an action to commit or rollback the
     * created transaction.
     */
    fun transaction(transactional: (TExecutionInfo?) -> Unit): TransactionCompletion

    /**
     * Take the list of [queries] specified and execute them. Any information required to execute these, e.g. a
     * specific connection, should be included in [TExecutionInfo]. Returns a [CompletionStage] for an [IntArray]
     * which will be resolved with an array of counts of affected rows per each [TQuery] specified in [queries].
     */
    fun batchExecute(queries: List<TQuery>, executionInfo: TExecutionInfo? = null): CompletionStage<IntArray>
}