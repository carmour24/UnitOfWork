package com.opidis.ca.data

import org.jooq.DSLContext
import org.jooq.Query

class JooqQueryCoordinator(private val dslContext: DSLContext) : QueryCoordinator<Query> {

    override fun transaction(transactional: () -> Unit) = dslContext.connection { dslContext.transaction(transactional) }

    override fun batch(queries: List<Query>): IntArray = dslContext.batch(queries).execute()
}