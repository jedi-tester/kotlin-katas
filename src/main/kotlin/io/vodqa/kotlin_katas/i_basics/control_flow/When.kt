package io.vodqa.kotlin_katas.i_basics.control_flow

/**
 * @author sergei.prodanov
 */

fun returnBooleanWhenIntMatches(i: Int): Boolean? {
    return when(i) {
        0 -> true
        1 -> false
        else -> null
    }
}

fun returnMatchingInt(i: Int): Int? {
    return when(i) {
        0, 1 -> i
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

class WhenExamples() {

    fun selectUserType(userType: Int) {
        val result = when (userType) {
            0 -> "Administrator"
            2 -> "User"
            else -> "Invalid"
        }

        println(result)
    }

    fun selectAdministratorSubtype(userType: Int) {
        when (userType) {
            determineAdminSubtype(userType) -> {
                println("Subtype is OK.")
                selectAdministratorType(userType)
            }
            else -> println("Subtype NOT OK")
        }
    }

    private fun determineAdminSubtype(userType: Int): Int {
        return if (userType in 0..1) userType else -1
    }

    private fun selectAdministratorType(userType: Int) {
        val result = when (userType) {
            0 -> "Administrator"
            1 -> "Moderator"
            else -> "Invalid"
        }
        println("Administrator type is $result")
    }

    fun determineUserPermissions(userType: Int) {
        val result = when (userType) {
            0, 1 -> "rwx"
            2 -> "r--"
            else -> "---"
        }
        println("Permission $result granted")
    }

    fun shotResult(x: Int) {
        val outer = 0
        val inner = 100

        val result = when (x) {
            in outer..inner -> "hit inside target"
            in (outer/2)..(inner/2) -> "hit close to middle"
            50 -> "hit bulls eye"
            else -> "Missed"
        }

        println("You have $result")
    }

    fun checkForValType(a: Any) = checkForValueType(a)

    fun replaceElseIfElseChain(x: Int) = whenAsIfElseIfChain(x)
}

fun main(args: Array<String>) {

}