package io.vodqa.kotlin_katas.ii_classes_and_objects.delegations.delegated_properties

import kotlin.reflect.KProperty

/**
 * @author sergei.prodanov
 */

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    e.p = "New Value"
}