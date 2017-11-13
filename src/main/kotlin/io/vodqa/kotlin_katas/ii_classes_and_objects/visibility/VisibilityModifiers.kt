package io.vodqa.kotlin_katas.ii_classes_and_objects.visibility

/**
 * @author sergei.prodanov
 */

fun foo() {} // 'public' modifier is used by default if no modifier is provided

class Bar // 'public' modifier is used by default if no modifier is provided

private val baz: Int = 1 // If you mark a declaration private , it will only be visible inside the file containing the declaration

internal val bar: String = "" // If you mark it internal , it is visible everywhere in the same module

//protected val foo: Any = "" // this will not compile as protected modifier is not available for top-level declarations

// Property accessors can have their own modifiers
var foo: String = "Public String" // this is visible everywhere
//    internal get() = // this will not compile as getters have to have same visibility as the property itself
    private set // setter can is only visible inside the file containing the property

private var fooBar: String = "Private String"
//    public set // this will not compile because setter has to be same or lower visibility than property itself


class ClassesVisibility {
//    private       - visible inside this class only (including all its members);
//    protected     — same as private + visible in subclasses too;
//    internal      — any client inside this module who sees the declaring class sees its internal members;
//    public        — any client who sees the declaring class sees its public members.
}

// Examples
open class Outer {
    private val a = "private"
    protected open val b = "protected"
    internal val c = "internal"
    val d = "public"

    protected class Nested {
        public val e = "nested public"
    }

    fun printAllOuter() {
        println(a)
        println(b)
        println(c)
        println(d)
        println(Nested::e)
    }
}

class Subclass : Outer() {

    fun printVisibleProperties() {
//        println(a) // this is not visible
        println(b)
        println(c)
        println(d)
        println(Nested::e)
    }
}

class Unrelated(private val outer: Outer) {

    fun printVisibleProperties() {
//        println(outer.a) // not visible
//        println(outer.b) // not visible
        println(outer.c) // visible (same module)
        println(outer.d) // visible (public)
//        println(outer.Nested) // not visible
//        println(Nested::e) // not visible
    }
}

fun main(args: Array<String>) {
    val sub = Subclass()
    sub.printVisibleProperties()

    val unrltd = Unrelated(Outer())
    unrltd.printVisibleProperties()
}