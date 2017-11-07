package io.vodqa.kotlin_katas.i_basics.control_flow

/**
 * @author sergei.prodanov
 */

fun iterateOverArrayViaIndices(array: Array<Any>) {
    for (index in array.indices) {
        println(array[index])
    }
}

fun iterateOverArrayViaWithIndexFun(array: Array<Any>) {
    for ((index, value) in array.withIndex()) {
        println("The element at $index is $value")
    }
}

fun inlineForIteration(array: Array<Any>) {
    for (index in array.indices) println(array[index])
}