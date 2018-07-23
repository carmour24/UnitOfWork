package com.opidis.ca.data

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


internal fun <T> makeObservable(initialValue: T, entity: Entity, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? =
null) =
        Delegates.observable(initialValue = initialValue) { _, _, _ ->
            entityTrackingUnitOfWork?.trackChange(tracked = entity)
        }

typealias EntityTracker<T> = (KProperty<*>, T, T) -> Unit

fun <T, TEntity: Entity> createEntityTracker(thisEntity: TEntity, onChange: ((TEntity) -> Unit)?): EntityTracker<T> {
    return {_, _, _ ->
        onChange?.invoke(thisEntity)
    }
}

internal fun <T> makeObservable2(
        initialValue: T,
        onEntityChange: EntityTracker<T>?
): ReadWriteProperty<Any?, T> {
    val noop: EntityTracker<T> = { _, _, _ -> }

    return Delegates.observable(initialValue = initialValue, onChange = onEntityChange ?: noop)
}
