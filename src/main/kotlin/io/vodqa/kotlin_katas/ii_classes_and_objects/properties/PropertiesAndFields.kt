package io.vodqa.kotlin_katas.ii_classes_and_objects.properties

/**
 * @author sergei.prodanov
 */

class PersonalAddress {
    var name: String = ""
    var street: String = ""
    var city: String = ""
    var state: String? = null
    var zip: String = ""

    fun copyAddress(address: PersonalAddress): PersonalAddress {
        val result = PersonalAddress()

        result.name = address.name // accessors are called directly
        result.street = address.street
        //...

        return result
    }

    val stateIsNull: Boolean
        get() = this.state == null
//        set(value) { //val properties can not have setters
//            field = ...
//        }

    var stringRepresentation: String
        get() = this.toString()
        set(value) {
            setDataFromString(value)
        }

    private fun setDataFromString(string: String) {
        this.city = string
    }

}

// TODO: 11/9/2017 add examples for more complex getters and setters