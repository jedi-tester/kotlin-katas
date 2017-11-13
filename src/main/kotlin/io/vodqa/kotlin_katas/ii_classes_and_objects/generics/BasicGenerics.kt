package io.vodqa.kotlin_katas.ii_classes_and_objects.generics

/**
 * @author sergei.prodanov
 */

class Box<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {
    val boxDouble: Box<Double> = Box(1.00)

    // If the parameters may be inferred, e.g. from the constructor arguments or by some other means,
    // it is allowed to omit the type arguments:
    val boxInt = Box(1)
    val boxString = Box("Box")
}

// TODO: 11/13/2017 Add generics examples with Variance (in-out)