package com.opidis.ca.data

import kotlin.properties.Delegates
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

class ObservableUser(name: String, address: Array<String>, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? = null) : Entity {
    var name: String by makeObservable(name, this, entityTrackingUnitOfWork)
    var address: Array<String> by makeObservable(address, this, entityTrackingUnitOfWork)
}

class ObservableUser2(name: String, address: Array<String>, onChange: ((ObservableUser2) -> Unit)?): Entity {
    private val stringEntityTracker = createEntityTracker<String, ObservableUser2>(this, onChange)
    private val stringArrayEntityTracker = createEntityTracker<Array<String>, ObservableUser2>(this, onChange)

    var name: String by makeObservable2(name, stringEntityTracker)
    var address: Array<String> by makeObservable2(address, stringArrayEntityTracker)
}

class ObservableUser3(name: String, address: Array<String>, onChange: ((ObservableUser3) -> Unit)?): Entity {
    var name: String by Delegates.observable(name, onChange = makeObservable3(this,  onChange))
    var address: Array<String> by Delegates.observable(address, onChange = makeObservable3(this, onChange))
}
