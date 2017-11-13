package io.vodqa.kotlin_katas.ii_classes_and_objects.classes_and_inheritance

/**
 * @author sergei.prodanov
 */

class CompanionObjectExample() {
    companion object {
        fun imKindOfAStaticObject() {
            println("Using a Companion")
        }
    }
}

fun main(args: Array<String>) {
    CompanionObjectExample.Companion.imKindOfAStaticObject()
}