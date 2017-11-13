package io.vodqa.kotlin_katas.ii_classes_and_objects.enums

/**
 * @author sergei.prodanov
 */

// Each enum constant is an object. Enum constants are separated with commas.

//The most basic usage of enum classes is implementing type-safe enums:
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

// Since each enum is an instance of the enum class, they can be initialized as:
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// it's possible to access the constants in an enum class in a generic way,
// using the 'enumValues<T>()' and 'enumValueOf<T>()' functions:
inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name } + "\n")
}

inline fun <reified T : Enum<T>> printValue(name: String) {
    print(enumValueOf<T>(name))
    println()
}

// Enum constants can declare their own anonymous classes:
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

fun main(args: Array<String>) {
    printAllValues<Color>()
    printAllValues<ProtocolState>()
    printAllValues<Direction>()

    printValue<Color>("BLUE")

    // Every enum constant has properties to obtain its name and position in the enum class declaration:
    // val name: String
    // val ordinal: Int
    println(Color.BLUE.name)
    println(Color.BLUE.ordinal)
}