package io.vodqa.kotlin_katas.i_basics.control_flow

/**
 * @author sergei.prodanov
 */

fun regularWhileExp(i: Int) {
    var a = i

    while (a < 100) {
        println(i)
        a++
    }
}

fun doWhileExp(i: Int) {
    var a = i
    do {
        println(i)
        a++
    } while (a < 100)
}