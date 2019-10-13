package `8_object_oriented`

class Quadrado(val area: Float)

data class Triangulo(val area: Float)

data class Params(var b: Boolean, var s: String, var i: Int){
    fun tes(){
        println("sdsifhfa")
    }
}

fun teste(p : Params) {

}

fun main() {

    val g1 = Quadrado(10f)
    val g2 = Quadrado(10f)

    val t1 = Quadrado(10f)
    val t2 = Quadrado(10f)
}