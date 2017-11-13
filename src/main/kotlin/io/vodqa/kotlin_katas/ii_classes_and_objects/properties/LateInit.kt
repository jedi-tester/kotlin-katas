package io.vodqa.kotlin_katas.ii_classes_and_objects.properties

/**
 * @author sergei.prodanov
 */

class LateInitPropertiesExample {

    private lateinit var lateInitProperty: String
    private lateinit var lateInitException: String
//    lateinit val lateInitImmutableProperty: String // this will not compile as lateinit modifier can only be applied to 'var' properties
//    lateinit var lateInitNullType: String? // this will not compile as type of lateinit property can not be null
//    private lateinit var x: Int // this will not compile as lateinit modifier is not allowed for primitive types

    fun setUp() {
        lateInitProperty = "This property is late-initialized"
        println(lateInitProperty)
        println(lateInitException) // this will throw 'kotlin.UninitializedPropertyAccessException: lateinit property lateInitException has not been initialized'
    }
}

class Foo {
    private var string: String // if initialized inside init block, then lateinit is not required
    private lateinit var string2: String

    init {
        string = "This lateinit property was initialized inside init constructor"
    }

    fun printLateInitProperties() {
        println(string)
        println(string2)
    }
}

//class LateInitInsidePrimaryConstructor(lateinit var x: Int) // this does not compile as late-initialized property can not be declared inside primary constructor

fun main(args: Array<String>) {
    val clz = LateInitPropertiesExample()
    clz.setUp()

    val foo = Foo()
    foo.printLateInitProperties()
}