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

class IfExamples() {

    fun ifExample(a: Int, b: Int) {
        val result = if (a < b) println("$a is less than $b") else println("$a is grater than $b")
    }

    fun ifExample2(string: String) {
        val result = if (string.contains("test")) {
            println("this is a test string")
            string
        } else {
            println("this is not a test string")
            null
        }

        println(result)
    }

    fun ifExample3(a: Int, b: Int) {
        var max = a
        if (a < b) max = b
        println(max)
    }

    //note we can make 'max' immutable because we are not changing the value as compared to 'ifExample3(a, b)'
    fun ifExample4(a: Int, b: Int) {
        val max = if (a < b) b else a
        println(max)
    }
}