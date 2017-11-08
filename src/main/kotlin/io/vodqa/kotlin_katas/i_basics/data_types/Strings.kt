package io.vodqa.kotlin_katas.i_basics.data_types

/**
 * @author sergei.prodanov
 */

val escapedString = "This is a literal string. \nYou need to use escape chars in this kind of string." +
        "\t this is a tab char" +
        "\b this is a backspace" +
        "\n this is a newline " +
        "\r this is a carriage return" +
        "\' this is a single quote" +
        "\" this is a double quote" +
        "\\ this is a backslash" +
        "\$ this is a dollar sign" +
        "\n Any other character needs to be escaped using Unicode escape sequence syntax, i.e. '\uFF00' "

val rawString = """
        |This is a template string.
        |You can type new lines any any kinds of characters without the need of using escape backslash.
        |Like this ' or " or \
        |But you need to trim margin to remove leading whitespace with trimMargin().
        |Default margin symbol is a pipe |.
        |However you can specify a custom margin and pass it to the trimMargin() function.
""".trimMargin()

// It is possible to iterate through a string in a loop
fun iterateOverAString(string: String) {
    for (c in string) {
        println(c)
    }
}

// Because Strings are sequences of Char, you can access any char by indexing operation: string[i]
fun getStringCharAtIndex(string: String, i: Int): Char {
    return string[i]
}

// String Templates
val i = 10
val stringWithTemplate = "Int i = ${i}"

val str = "string"
val stringWithArbitraryExpressionTemplate = "String str length is ${str.length}"

val rawStringWithArbitraryExpressionTemplate = """
    ${str.length}
"""

val rawStringWithDollarSign = """
    ${'$'}${i}
"""
