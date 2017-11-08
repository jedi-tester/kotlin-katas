package io.vodqa.kotlin_katas.ii_classes_and_objects.data_classes

/**
 * @author sergei.prodanov
 */

data class ImmutablePerson(
        val firstName: String,
        val lastName: String,
        val age: Byte
)

data class MutablePerson(
        var firstName: String,
        var lastName: String,
        var age: Byte
)

data class PartiallyMutablePerson(
        var firstName: String,
        var lastName: String,
        var age: Byte,
        val sex: String = "unknown" // this will have a default value 'unknown' but can be assigned when object is created
                                    // (can't be re-assigned though after object is created)
)