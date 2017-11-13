package io.vodqa.kotlin_katas.ii_classes_and_objects.extensions

/**
 * @author sergei.prodanov
 */

class SomeClass

val SomeClass.s: String
    get() = "extended property"


// Extensions do not actually insert members into classes, hence there's no efficient way for an extension property to
// have a backing field.
// This is why initializers are not allowed for extension properties. Their behavior can only be defined
// by explicitly providing getters/setters.

//val SomeClass.x: Int = 1 // this won't compile