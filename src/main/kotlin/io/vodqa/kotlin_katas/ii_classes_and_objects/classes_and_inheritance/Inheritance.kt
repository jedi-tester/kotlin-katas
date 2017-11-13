package io.vodqa.kotlin_katas.ii_classes_and_objects.classes_and_inheritance

/**
 * @author sergei.prodanov
 */

class Closed //all classes are closed (private) by default


open class Base(x: Int) //in order to be able to extend a class, base class has to be explicitly annotated as 'open'

class Derived(x: Int) : Base(x) // If the class has a primary constructor, the base type can (and must) be initialized right there,
                                // using the parameters of the primary constructor.

// If the class has no primary constructor, then each secondary constructor has to initialize the base type using the super
// keyword, or to delegate to another constructor which does that.
// Note that in this case different secondary constructors can call different constructors of the base type:
class AnotherDerived : Base {
    constructor(x: Int) : super(x)

    constructor(x: Int, s: String) : super(x)
}

open class Person(age: Int) {
    open fun greet() {} // same 'open' concept applies for functions which need to be overridden be derived class

    fun walk() = println("Walking")
}

class Male : Person{
    constructor(age: Int, name: String) : super(age)

    override fun greet() {
        println("Hi, I'm a male")
    }
}

open class Female(age: Int) : Person(age) {
    constructor(age: Int, name: String) : this(age)

    override fun greet() {
        println("Hi, I'm a female")
    }
}

class Lady : Female {
    constructor(age: Int) : super(age)

    constructor(age: Int, name: String) : super(age, name)

    // we can add 'final' modifier to prohibit further overriding by any class that might be derived from Lady class
    // all methods that have 'override' are 'open' by default
    final override fun greet() {
        println("HI, I'm a Lady")
    }
}

// Overriding Properties
open class Foo {
    open val x: Int = 10 // overriding properties works similar to overriding methods

    val y: Int = 100
}

class Bar1 : Foo() {
    override val x = 1000
//    override val y = 1 // this does not compile as 'y' is not open in 'Foo"
}

class Bar2 : Foo() {
    override var x: Int = 25 // you can override 'val' properties with 'var', but not vice versa
}

class Bar3(override val x: Int = 15) : Foo() { // properties can be overridden in the constructor of the derived class as well
}


// Calling super class implementations
open class GrandParent {
    open fun doSomething() { println("GrandParent doing something. ") }

    open val age: Int get() = 50
}

class Parent : GrandParent() {
    override fun doSomething() {
        super.doSomething() // we can call implementation of 'doSomething' of Parent class using super keyword
        println("Parent doing something")
    }

    override val age: Int
        get() = super.age - 25 // same applies for properties

    //Inside an inner class, accessing the superclass of the outer class is done with the super keyword
    // qualified with the outer class name: super@Outer
    inner class Child {
        fun getParentToDoSomething() {
            super@Parent.doSomething() // calls Parent's doSomething() implementation
            println(super@Parent.age) // uses Parent's 'age' property getter implementation
        }
    }
}


// Multi-implementation Inheritance rules
interface A {
    fun a() { println("a") }
    fun f() { println("A") }
}

open class B {
    fun b() { println("b") }
    open fun f() { println("B") }
}

class C : A, B() {
    // Here the compiler requires to override f()
    override fun f() {
        super<A>.f() // call to A.f()
        super<B>.f() // call to B.f()
    }
}


fun main(args: Array<String>) {
    val c = C()
    c.a()
    c.b()
    c.f()
}