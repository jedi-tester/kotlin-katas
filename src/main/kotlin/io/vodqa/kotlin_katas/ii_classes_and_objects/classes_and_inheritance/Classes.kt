package io.vodqa.kotlin_katas.ii_classes_and_objects.classes_and_inheritance

import javafx.scene.Parent

/**
 * @author sergei.prodanov
 */

class Empty // will create an empty class (no need to add curly braces)

class CarWithPrimaryConstructor constructor(model: String) // this class has a primary constructor

class CarWithImpliedPrimaryConstructor(model: String) { // constructor keyword can be omitted if there are no annotations or visibility modifiers for it

    fun print() {
//        println("Car class initialized with $model") // this does not compile because 'model' was not initialized
    }
}

class CarWithInitBlock(model: String) {
    init { // this block will be executed first at the time of class object creation
        println("Car class initialized with $model")
    }
}

class CarWithImpliedPropsInit(private val model: String) { // we can specify var/val for property and it will be automatically declared and initialized in the primary constructor

    fun print() {
        println("Car class initialized with $model")
    }
}

class CarWithPrivatePrimaryConstructor private constructor(model: String) {

}

class CarWithSecondaryConstructor private constructor(val model: String) {

    constructor(model: String, manufactureYear: Short) : this(model) {
    }
}

fun main(args: Array<String>) {
//    val car = CarWithSecondaryConstructor("Ferrari") // this won't compile as primary constructor is 'private'
    val car2 = CarWithSecondaryConstructor("Aston Martin", 1999.toShort())

//    println(car.model)
    println(car2.model)
}
