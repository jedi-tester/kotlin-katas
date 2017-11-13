package io.vodqa.kotlin_katas.ii_classes_and_objects.interfaces

/**
 * @author sergei.prodanov
 */

// Interfaces A and B both declare functions foo() and bar().
// Both of them implement foo(), but only B implements bar() (bar() is not marked abstract in A,
// because this is the default for interfaces, if the function has no body).
interface A {
    fun foo() {
        println("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        println("B")
    }

    fun bar() {
        println("bar")
    }
}

class C : A {
    override fun bar() {
        println("bar")
    }
}

// If we derive D from A and B , we need to implement all the methods which we have inherited from multiple interfaces,
// and to specify how exactly D should implement them.
// This rule applies both to methods for which we've inherited a single implementation (bar()) and multiple implementations (foo()).
class D: A, B {
//    override fun foo() {} // this and following methods are conflicting because of the same function name
//    override fun foo() {}

    override fun bar() {
        super<B>.bar()
    }

    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
}