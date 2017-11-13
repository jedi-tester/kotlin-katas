package io.vodqa.kotlin_katas.ii_classes_and_objects.extensions

/**
 * @author sergei.prodanov
 */

class Foo {

    fun foo() {
        println("foo")
    }
}

fun Foo.bar() {
    println("bar")
}


open class C

class D: C()

fun C.foo() = "c"

fun D.foo() = "d"

fun printFoo(c: C) {
    println(c.foo())
}

class A {
    fun foo() { println("member") }
}

fun A.foo(x: Int) { println("extension") }


class Nullable

fun Nullable?.toString(): String {
    return if (this == null) "null" else toString()
}

fun main(args: Array<String>) {
//    printFoo(D())

    A().foo()
    A().foo(1)
}