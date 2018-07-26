package com.opidis.unitofwork.data

import org.jooq.Query
import org.reactivestreams.Publisher
//import reactor.core.publisher.Mono

typealias QueryExecutor = (Query) -> Publisher<*>

abstract class CrudRepository<T, ID>(protected val queryExecutor: QueryExecutor? = null) {

    protected inline fun <reified S>executeQuery(query: Query): Publisher<S> {
        // If we don't have a query executor defined then execute the query just now
        // and return a mono with the content.
        if (queryExecutor == null) {

            // Default is just to execute a query on the current thread.
//            return Mono.just(query.execute() as S)
        }

        // If we have a query executor, then invoke that. E.g. to batchExecute inserts within a transaction
        // Or to run all queries synchronously on a specific thread distinct from the event loop thread.
        // Unchecked cast, is there a better way to do this? We do want an exception if this cast fails
        // for some reason so I expect this will be fine.
        return queryExecutor?.invoke(query) as Publisher<S>
    }

    /*
    abstract fun <S : T> save(var1: S): Mono<S>

    abstract fun <S : T> saveAll(var1: Iterable<S>): Flux<S>

    abstract fun <S : T> saveAll(var1: Publisher<S>): Flux<S>

    abstract fun findById(var1: ID): Mono<T>

    abstract fun findById(var1: Publisher<ID>): Mono<T>

    abstract fun existsById(var1: ID): Mono<Boolean>

    abstract fun existsById(var1: Publisher<ID>): Mono<Boolean>

    abstract fun findAll(): Flux<T>

    abstract fun findAllById(var1: Iterable<ID>): Flux<T>

    abstract fun findAllById(var1: Publisher<ID>): Flux<T>

    abstract fun count(): Mono<Long>

    abstract fun deleteById(var1: ID): Mono<Void>

    abstract fun deleteById(var1: Publisher<ID>): Mono<Void>

    abstract fun delete(var1: T): Mono<Void>

    abstract fun deleteAll(var1: Iterable<T>): Mono<Void>

    abstract fun deleteAll(var1: Publisher<out T>): Mono<Void>

    abstract fun deleteAll(): Mono<Void>
    */
}
