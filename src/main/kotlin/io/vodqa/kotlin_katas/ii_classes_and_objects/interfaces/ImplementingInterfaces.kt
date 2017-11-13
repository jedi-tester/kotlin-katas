package io.vodqa.kotlin_katas.ii_classes_and_objects.interfaces

/**
 * @author sergei.prodanov
 */

interface Vehicle {
    fun foo()

    fun bar() {
        // body is optional as interface can have both abstract functions and ones with implementation
    }
}

class Car : Vehicle {

    override fun foo() {
    }

    // bar() is no needed to be overridden because it has it's own body in super class

    override fun bar() {
        // still we can override it if need be since all functions in an interface are open
    }
}