package io.vodqa.kotlin_katas.i_basics.control_flow

/**
 * @author sergei.prodanov
 */

//Traditional if usage
fun getMax(a: Int, b: Int): Int {
    var max = a
    if (a < b) max = b
    return max
}

//With else
fun getMax(a: Long, b: Long): Long {
    val max: Long

    if (a > b) {
        max = a
    } else {
        max = b
    }

    return max
}

//As expression
fun getMax(a: Double, b: Double): Double {
    val max = if (a > b) {
        a
    } else {
        b
    }

    return max
}

//In return statement
fun getMax(a: Float, b: Float): Float {
    return if (a > b) a else b
}
