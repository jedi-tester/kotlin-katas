package io.vodqa.kotlin_katas.ii_classes_and_objects.extensions

import java.lang.instrument.ClassFileTransformer

/**
 * @author sergei.prodanov
 */

class ClassOne {
    fun bar() {
        println("Called ${this.javaClass}")
    }
}

class ClassTwo {
    fun baz() {
        println("Called ${this.javaClass}")
    }

    // Inside a class, you can declare extensions for another class.
    // Inside such an extension, there are multiple implicit receivers -
    // objects members of which can be accessed without a qualifier.
    // The instance of the class in which the extension is declared is called 'dispatch receiver',
    // and the instance of the receiver type of the extension method is called 'extension receiver'.
    fun ClassOne.foo() {
        bar() // calls ClassOne.bar
        baz() // calls ClassTwo.baz

        //resolving name conflicts of dispatch and extension receiver members with qualified this syntax
        toString() // calls ClassOne.toString()
        this@ClassTwo.toString() // calls ClassTwo.toString()
    }

    fun caller(classOne: ClassOne) {
        classOne.foo() // call the extension function
    }
}

// Extensions declared as members can be declared as open and overridden in subclasses.
// This means that the dispatch of such functions is virtual with regard to the dispatch receiver type,
// but static with regard to the extension receiver type.
open class ClassThree

class ClassFour: ClassThree()

open class ClassFive {
    open fun ClassThree.foo() {
        println("ClassThree.foo() in ClassFive")
    }

    open fun ClassFour.foo() {
        println("ClassFour.foo() in ClassFive")
    }

    fun caller(classThree: ClassThree) {
        classThree.foo()
    }
}

class ClassSix: ClassFive() {
    override fun ClassThree.foo() {
        println("ClassThree.foo() in ClassSix")
    }

    override fun ClassFour.foo() {
        println("ClassFour.foo() in ClassSix")
    }
}

fun main(args: Array<String>) {
    ClassTwo().caller(ClassOne())
//    ClassOne().foo() // unresolved reference as the extension is declared as ClassTwo member

    ClassFive().caller(ClassThree()) // prints "ClassThree.foo() in ClassFive"
    ClassSix().caller(ClassThree()) // prints "ClassThree.foo() in ClassSix"
    ClassFive().caller(ClassFour()) // prints "ClassThree.foo() in ClassFive"
}