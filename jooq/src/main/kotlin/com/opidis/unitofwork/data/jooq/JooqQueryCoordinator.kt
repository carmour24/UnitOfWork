package com.opidis.unitofwork.data.jooq

import com.opidis.unitofwork.data.QueryCoordinator
import org.jooq.DSLContext
import org.jooq.Query

class JooqQueryCoordinator(private val dslContext: DSLContext) : QueryCoordinator<Query> {

    override fun transaction(transactional: () -> Unit) = dslContext.connection {
        dslContext.transaction(transactional)
    }

    override fun batchExecute(queries: List<Query>): IntArray = dslContext.batch(queries).execute()
}