package io.vodqa.kotlin_katas.i_basics.control_flow

/**
 * @author sergei.prodanov
 */

fun main(args: Array<String>) {
}

fun returnBooleanWhenIntMatches(i: Int): Boolean? {
    return when(i) {
        0 -> true
        1 -> false
        else -> null
    }
}

fun returnMatchingInt(i: Int): Int? {
    return when(i) {
        0 -> 0
        1 -> 1
        else -> null
    }
}

fun useArbitraryExprInWhen(i: Int): Int? {
    return when(i) {
        returnMatchingInt(i) -> 10
        else -> null
    }
}

fun checkForRangeInWhen(a: Int) {
    val negativeValidNumbers = -100..-1

    when(a) {
        in 0..9 -> println("$a is in 0..9 range")
        in negativeValidNumbers -> println("$a is in $negativeValidNumbers range")
        !in 10..20 -> println("$a is !in 10..20 range")
        else -> println("$a does not match any of the when() cases")
    }
}

fun checkForValueType(a: Any) = when(a) {
    is String -> println("$a is String")
    is Int -> println("$a is Int")
    else -> println("$a is ${a::class}")
}

fun whenAsIfElseIfChain(x: Int) {
    when {
        x % 2 == 0 -> println("$x is even")
        x % 2 != 0 -> println("$x is odd")
    }
}

// TODO: 11/7/2017 add more when examples (See Fundamental-Kotlin for more examples)