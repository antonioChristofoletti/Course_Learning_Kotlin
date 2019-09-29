/**
Double 64
Float  32
Long   64
Int    32
Short  16
Byte   8
 */

fun main() {
    val n1: Double = Double.MAX_VALUE

    val n2: Byte = n1.toByte()

    println(n2)

    val n3: Byte = 100

    // Convert the value from a smaller type to a bigger there isn't any problem
    println(n3.toShort())
    println(n3.toDouble())

    // Convert String to any other type is very easy
    println("10".toInt())
    println("25.25f".toFloat())
    println("It's going to crash !_!".toInt())
}

fun solvingConvertionProblem() {
    try {
        "error".toInt()
    } catch (e: NumberFormatException) {
        println("Error to convert 'NumberFormatException'")
    } catch (e: Exception) {
        println("Error to convert 'Exception'")
    }
}