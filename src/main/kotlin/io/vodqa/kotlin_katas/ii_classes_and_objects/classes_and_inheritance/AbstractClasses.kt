package io.vodqa.kotlin_katas.ii_classes_and_objects.classes_and_inheritance

/**
 * @author sergei.prodanov
 */

open class BaseClass {
    open fun f() { println("Using BaseClass") }
}

// A class and some of its members may be declared abstract.
// An abstract member does not have an implementation in its class.
// Abstract classes and functions are 'open' by default
abstract class DerivedAbstractClass : BaseClass() {
    override abstract fun f() // we can override a non-abstract open member with an abstract one
}

class DerivedClass : DerivedAbstractClass() {
    override fun f() {
        println("Using DerivedClass")
    }
}

fun main(args: Array<String>) {
    val x = DerivedClass()
    val b = BaseClass()

    x.f()
    b.f()
}