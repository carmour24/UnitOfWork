package kotlin

import org.jooq.DSLContext
import org.jooq.Record
import org.jooq.Table
import org.reactivestreams.Publisher
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

abstract class ExampleEntity(val id: Int, val name: String): Record

class ExampleEntityRepository(queryExecutor: QueryExecutor?, private val create: DSLContext, private val table: Table<ExampleEntity>)
    : CrudRepository<ExampleEntity, Int> (queryExecutor = queryExecutor) {
    fun <S : ExampleEntity?> save(p0: S): Mono<S> {
        return this.executeQuery<ExampleEntity>(create.update(table).set(p0)) as Mono<S>
    }

    fun findAll(): Flux<ExampleEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun deleteById(p0: Int?): Mono<Void> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun deleteById(p0: Publisher<Int>?): Mono<Void> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun deleteAll(p0: MutableIterable<ExampleEntity>?): Mono<Void> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun deleteAll(p0: Publisher<out ExampleEntity>?): Mono<Void> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun deleteAll(): Mono<Void> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun <S : ExampleEntity?> saveAll(p0: MutableIterable<S>?): Flux<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun <S : ExampleEntity?> saveAll(p0: Publisher<S>?): Flux<S> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun count(): Mono<Long> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun findAllById(p0: MutableIterable<Int>?): Flux<ExampleEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun findAllById(p0: Publisher<Int>?): Flux<ExampleEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun existsById(p0: Int?): Mono<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun existsById(p0: Publisher<Int>?): Mono<Boolean> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun findById(p0: Int?): Mono<ExampleEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun findById(p0: Publisher<Int>?): Mono<ExampleEntity> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun delete(p0: ExampleEntity?): Mono<Void> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}