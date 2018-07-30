package com.opidis.unitofwork.data

import kotlin.properties.Delegates

class ObservableUser(name: String, address: Array<String>, onChange: ((ObservableUser) -> Unit)?): Entity {
    var name: String by Delegates.observable(name, onChange = makeObservable(this, onChange))
    var address: Array<String> by Delegates.observable(address, onChange = makeObservable(this, onChange))
}