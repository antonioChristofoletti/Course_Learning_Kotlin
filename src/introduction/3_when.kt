package introduction

fun getSoma(v1: Float, v2: Float, operation: String): Float {

    if(v1 in 1..100)
        println("Está no intervalo entre 1 a 100")

    when (operation) {

        "somar" -> {
            return v1 + v2
        }

        "subtracao" -> {
            return v1 - v2
        }

        "dividir" -> {
            return v1 / v2
        }

        "multiplicar" -> {
            return v1 * v2
        }

        else -> {
            throw Exception("Operação inválida")
        }
    }
}