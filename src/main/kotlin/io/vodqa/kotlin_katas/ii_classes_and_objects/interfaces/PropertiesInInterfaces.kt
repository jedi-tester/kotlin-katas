package io.vodqa.kotlin_katas.ii_classes_and_objects.interfaces

/**
 * @author sergei.prodanov
 */

interface Human {
    val age: Int // this is an abstract property

    val name: String?
        get() = null // same as functions, properties in interfaces can also have implementations

    fun getNameAndAgeOfAPerson() {
        println("Age is $age, and name is $name")
    }
}

class Man(override val age: Int, override val name: String) : Human {
    fun getNameAndAgeOfAMan() {
        super.getNameAndAgeOfAPerson()
    }
}

class Woman(override var age: Int) : Human {

}


fun main(args: Array<String>) {
    val man = Man(101, "Jack Daniels")

    man.getNameAndAgeOfAMan()
    man.getNameAndAgeOfAPerson()

    val woman = Woman(21)
    woman.getNameAndAgeOfAPerson()
}