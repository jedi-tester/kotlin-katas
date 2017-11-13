package io.vodqa.kotlin_katas.ii_classes_and_objects.sealed_classes

/**
 * @author sergei.prodanov
 */

sealed class Expression

data class Constant(val num: Double) : Expression()

data class Sum(val exp1: Expression, val exp2: Expression) : Expression()

object NotANumber : Expression()

fun evaluate(expr: Expression): Double = when(expr) {
    is Constant -> expr.num
    is Sum -> evaluate(expr.exp1) + evaluate(expr.exp2)
    NotANumber -> Double.NaN
    // else is not required here because we've covered all cases for the expr
}

fun main(args: Array<String>) {
    println(evaluate(Constant(1.0)))
    println(evaluate(Sum(Constant(1.0), Constant(2.0))))
}