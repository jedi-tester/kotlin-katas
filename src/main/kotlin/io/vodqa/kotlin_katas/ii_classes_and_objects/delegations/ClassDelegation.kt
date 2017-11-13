package io.vodqa.kotlin_katas.ii_classes_and_objects.delegations

/**
 * @author sergei.prodanov
 */

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

// Class Derived can inherit from an interface Base and delegates all of its public methods to a specified object:
class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)

    Derived(b).print() // prints 10
}