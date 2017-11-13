package io.vodqa.kotlin_katas.ii_classes_and_objects.properties

/**
 * @author sergei.prodanov
 */

// Properties the value of which is known at compile time can be marked as compile time constants using the const modifier

// These can, for example, be used in annotations
const val SUBSYSTEM_DEPRECATED = "This subsystem is deprecated" // constants have to be top-level members

@Deprecated(SUBSYSTEM_DEPRECATED) fun foo () {}

object Bar {
    const val SOMETHING_CONSTANT: Int = 1 // constants can be primitive types and members of objects

//    const val ERRONEOUS_CONSTANT_TYPE: Any // this will not compile as constants can only be Strings and primitive types

//    const val CONSTANT_WITH_CUSTOM_GETTER: String = "Constant with a getter"
//        get() = "" // this will not compile as constants can not have custom getters
}

fun main(args: Array<String>) {
    foo()

    println(Bar.SOMETHING_CONSTANT)
}