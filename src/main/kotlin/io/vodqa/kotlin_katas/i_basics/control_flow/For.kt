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

fun iterateDownTo(from: Int, downTo: Int) {
    if (from > downTo) {
        for (a: Int in from..downTo) {
//            for (a:Int in from downTo downTo) // for iterating from top to bottom can use "downTo' or '..' syntax
            println(a)
        }
    } else {
        println("Incorrect range")
    }
}

fun iterateWithStep(start: Int, end: Int, step: Int) {
    if (start < end) {
        for (a: Int in start..end step(step)) {
            println(a)
        }
    } else {
        println("Incorrect range")
    }
}

fun iterateOverLists(list: List<Any>) {
    for (element in list) {
        println(element)
    }
}