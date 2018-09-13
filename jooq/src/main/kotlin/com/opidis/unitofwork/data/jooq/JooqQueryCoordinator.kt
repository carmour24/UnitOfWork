package com.opidis.unitofwork.data.jooq

import com.opidis.unitofwork.data.ExecutionInfo
import com.opidis.unitofwork.data.QueryCoordinator
import com.opidis.unitofwork.data.TransactionCompletion
import org.jooq.DSLContext
import org.jooq.Query
import java.util.concurrent.CompletableFuture

class JooqQueryCoordinator(private val dslContext: DSLContext) : QueryCoordinator<Query, ExecutionInfo> {

    override fun transaction(transactional: (ExecutionInfo?) -> Unit): TransactionCompletion {
        val future = CompletableFuture<Void>()
        dslContext.connection {
            dslContext.transaction { ->
                transactional(null)
                future.complete(null)
            }
        }

        return { future }
    }

    override fun batchExecute(queries: List<Query>, executionInfo: ExecutionInfo?): CompletableFuture<IntArray> {
        val queryResultFuture = CompletableFuture<IntArray>()
        queryResultFuture.complete(dslContext.batch(queries).execute())
        return queryResultFuture
    }
}