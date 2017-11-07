package io.vodqa.kotlin_katas.i_basics.returns_and_jumps

/**
 * @author sergei.prodanov
 */

fun main(args: Array<String>) {
    returnFromLambdaWithoutLabel()
}

fun breakAtLoopLabel() {
    loop@ for (i in 0..100) {
        println(i)
        if (i == 10) break@loop
    }
}

fun breakAtOuterLoopLabel() {
    loop@ for (i in 0..100) {
        for (j in 0..100) {
            println("i is $i, and j is $j")
            if (j == 10) break@loop
        }
    }
}

// TODO: 11/7/2017 add examples for continue jump expressions