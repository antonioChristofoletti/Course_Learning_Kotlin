package `package`

fun main() {
    callHelloWorld()

    `package-anotherPackage`.callHelloWorld()
}

fun callHelloWorld() {
    println("Hello World");
}