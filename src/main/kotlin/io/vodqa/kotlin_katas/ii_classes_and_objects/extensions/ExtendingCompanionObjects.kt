package io.vodqa.kotlin_katas.ii_classes_and_objects.extensions

/**
 * @author sergei.prodanov
 */

class MyClass {
    companion object { // will be called 'Companion'

    }
}

fun MyClass.Companion.foo() {
    println("Called Companion extension fun foo()")
}

val MyClass.Companion.string
    get() = "Called Companion extension property"

fun main(args: Array<String>) {
    MyClass.foo()

    println(MyClass.string)
}