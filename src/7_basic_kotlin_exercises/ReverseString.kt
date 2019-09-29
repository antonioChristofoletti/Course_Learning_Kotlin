package `7_basic_kotlin_exercises`

import java.lang.StringBuilder

fun reverseUsingDB(str: String): String {
    return StringBuilder(str).reverse().toString()
}

fun reverseUsingLoop(str: String): String {

    var reversedStr = ""
    for (strChar in str) {
        reversedStr = strChar + reversedStr
    }

    return reversedStr
}