package io.vodqa.kotlin_katas.i_basics.data_types

/**
 * @author sergei.prodanov
 */

val simpleArrayOfInts = arrayOf(1, 2, 3, 4, 5)

val mixedArray = arrayOf(1, "1", '1', true, simpleArrayOfInts)

val arrayOfNulls = arrayOfNulls<Any>(5)

val ascArrayOfInts = Array(5, { i -> i+i })

val arrayOfInts = IntArray(1)

val arrayOfShorts = ShortArray(5)