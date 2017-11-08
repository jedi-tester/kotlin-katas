package io.vodqa.kotlin_katas.i_basics.data_types

/**
 * @author sergei.prodanov
 */

fun charToInt(c: Char): Int {
    return if (c in '0'..'9') c.toInt() - '0'.toInt() else throw IllegalArgumentException("Char out of range")
}