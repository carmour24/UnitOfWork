package com.opidis.unitofwork.data

class UnitOfWorkAwareUser(name: String, address: Array<String>, entityTrackingUnitOfWork: EntityTrackingUnitOfWork? = null) : Entity {
    var name: String by makeObservable(name, this, entityTrackingUnitOfWork)
    var address: Array<String> by makeObservable(address, this, entityTrackingUnitOfWork)
}
