package com.opidis.ca.data

class ObservableUser(name: String, address: Array<String>, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? = null) : Entity {
    var name: String by makeObservable("", this, entityTrackingUnitOfWork)
    var address: Array<String> by makeObservable(emptyArray(), this, entityTrackingUnitOfWork)

    init {
        this.name = name
        this.address = address
    }
}

class ObservableUser2(name: String, address: Array<String>, createEntityTracker: (Entity ->
EntityTracker<ObservableUser>)? = null): Entity {
    var name: String by makeObservable2("", createEntityTracker?.invoke(this))
//    var address: Array<String> by makeObservable2(emptyArray(), onChange)

//    init {
//        this.name = name
//        this.address = address
//    }
}
