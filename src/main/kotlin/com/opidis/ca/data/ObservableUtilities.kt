package com.opidis.ca.data

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

typealias EntityTracker<T> = (KProperty<*>, T, T) -> Unit

fun <T> makeObservable(initialValue: T, entity: Entity, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? =
null) =
        Delegates.observable(initialValue = initialValue) { _, _, _ ->
            entityTrackingUnitOfWork?.trackChange(tracked = entity)
        }

fun <T, TEntity>makeObservable(entity: TEntity, onChange: ((TEntity) -> Unit)?): EntityTracker<T> {
    return {
        _, _, _ ->
        onChange?.invoke(entity)
    }
}
