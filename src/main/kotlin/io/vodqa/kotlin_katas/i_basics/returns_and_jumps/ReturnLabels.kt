package io.vodqa.kotlin_katas.i_basics.returns_and_jumps

/**
 * @author sergei.prodanov
 */

fun returnFromLambdaWithoutLabel() {
    val intsArray = Array(10, { i -> i})

    intsArray.forEach {
        if (it == 0) return
        println(it)
    }
}

fun returnFromLambdaWithLabel() {
    val intsArray = Array(10, { i -> i})

    intsArray.forEach {
        if (it == 0) return@forEach
        println(it)
    }
}

fun returnFromAnonymousFun() {
    val intsArray = Array(10, { i -> i })

    intsArray.forEach(fun(value: Int) {
        if (value == 0) return
        println(value)
    })
}