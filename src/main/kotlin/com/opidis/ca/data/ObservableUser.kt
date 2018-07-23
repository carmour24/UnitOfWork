package com.opidis.ca.data

import kotlin.reflect.KClass
import kotlin.reflect.KProperty

class ObservableUser(name: String, address: Array<String>, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? = null) : Entity {
    var name: String by makeObservable("", this, entityTrackingUnitOfWork)
    var address: Array<String> by makeObservable(emptyArray(), this, entityTrackingUnitOfWork)

    init {
        this.name = name
        this.address = address
    }
}

class ObservableUser2(name: String, address: Array<String>, onChange: ((ObservableUser2) -> Unit)?): Entity {
    private val stringEntityTracker = createEntityTracker<String, ObservableUser2>(this, onChange)
    private val stringArrayEntityTracker = createEntityTracker<Array<String>, ObservableUser2>(this, onChange)

    var name: String by makeObservable2("", stringEntityTracker)
    var address: Array<String> by makeObservable2(emptyArray(), stringArrayEntityTracker)

    init {
        this.name = name
        this.address = address
    }
}
