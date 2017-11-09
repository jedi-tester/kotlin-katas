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

class BreakAndContinueLabelsExamples() {

    fun breakOuterLoop() {
        outer@ for (o in 0..100) {
            inner@ for (i in 0..100) {
                println("[outer == $o] [inner == $i]")
//                if (i == 10) break // this will break the @inner loop
                if (i == 10) break@outer //this will break the outer loop
            }
        }
    }
}