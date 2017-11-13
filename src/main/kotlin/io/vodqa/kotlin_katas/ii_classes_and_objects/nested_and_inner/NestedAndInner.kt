package io.vodqa.kotlin_katas.ii_classes_and_objects.nested_and_inner

import io.vodqa.kotlin_katas.ii_classes_and_objects.visibility.bar

/**
 * @author sergei.prodanov
 */

class Outer {
    private val bar = 1

    class Nested {
//        fun foobar() = this.bar   // this won't compile because we can't access members of outer class from a nested one.
                                    // For this to work we need to use 'inner' class implementation (See below.)
        fun foo() = 2
    }

    // Inner classes carry a reference to an object of an outer class therefore we can access members of outer from inner
    inner class Inner {
        fun foo() = bar
    }

}


fun main(args: Array<String>) {
    val nested = Outer.Nested()
    nested.foo() // == 2

    val inner = Outer().Inner()
    inner.foo() // == 1
}