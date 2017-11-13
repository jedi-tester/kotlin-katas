package io.vodqa.kotlin_katas.ii_classes_and_objects.delegations.delegated_properties

import kotlin.properties.Delegates

/**
 * @author sergei.prodanov
 */

// By default, the evaluation of lazy properties is synchronized: the value is computed only in one thread,
// and all threads will see the same value.
// If the synchronization of initialization delegate is not required, so that multiple threads can execute it simultaneously,
// pass LazyThreadSafetyMode.PUBLICATION as a parameter to the lazy() function.
// And if you're sure that the initialization will always happen on a single thread,
// you can use LazyThreadSafetyMode.NONE mode, which doesn't incur any thread-safety guarantees and the related overhead.
val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"
}