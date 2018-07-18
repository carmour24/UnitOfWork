package kotlin

import org.jooq.Configuration
import org.jooq.DSLContext
import org.jooq.Query
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono
import java.util.concurrent.CompletableFuture

interface UnitOfWork<in Tracked> {
    fun trackChange(tracked: Tracked): Mono<Int>
    fun complete()
}

class UnitOfWorkImpl(private val dslContext: DSLContext) : UnitOfWork<Query> {
     class QueryWrapper<T>(private val query: Query) {
        val future = CompletableFuture<T>()
        fun execute(configuration: Configuration) {
            // Attach the current DSLContext configuration to provide a connection to the currently detached query
            query.attach(configuration)

            val count = query.execute()
            future.complete(null)
        }
    }

    val queryList = mutableListOf<QueryWrapper<*>>()

    // Returns a mono, this could actually be a mono for a list containing
    // many elements though, so we have to be aware of this and map it upstream
    // after the mono has completed.
    fun trackChange(query: Query) : Mono<Int> {
        val queryWrapper = QueryWrapper<Mono>(query)
        queryList.add(queryWrapper)
        return queryWrapper.future.toMono()
    }

    override fun complete() {
        // Add code to move this onto the DB execution background thread pool
        dslContext.connection {
            dslContext.transaction { _ ->
                queryList.forEach {  it.execute(dslContext.configuration()) }
            }
        }
    }
}