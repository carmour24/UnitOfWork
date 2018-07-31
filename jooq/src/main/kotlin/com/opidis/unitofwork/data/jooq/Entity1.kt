package com.opidis.unitofwork.data.jooq

import com.opidis.unitofwork.data.Entity

class Entity1(val Id: Int, val name: String, val foreignName: Entity2? = null) : Entity

class Entity2(val Id: Int, val foreignName: String) : Entity
