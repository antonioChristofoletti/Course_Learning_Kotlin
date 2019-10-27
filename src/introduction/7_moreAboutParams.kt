package introduction

fun endereco(rua: String = "", cidade : String, estado: String, cep: String, numero: Int = 0){
    println("Rua $rua")
    println("Cidade: $cidade, $estado - $cep")
}

// unlimited params
fun media(vararg notas: Float){
    if(notas.isNotEmpty()){
        var soma = 0f
        for (nota in notas){
            soma += nota
        }
        println("A média é: ${soma/notas.size}")
    }
}

// unlimited params
fun <T> aceitaListaDeQualquerCoisa(vararg params: T){
        for (param in params){
            print("$param,")
        }
}

fun main(){
    endereco(cidade = "Campinas", estado = "São Paulo", cep = "13")

    aceitaListaDeQualquerCoisa(8f, "C", 'C', 25, false)

    // Examples using 'vararg' and 'named param'

    val str = "Lorem ipsum"

    str.capitalize()
    str.decapitalize()
    str.contentEquals("bla")
    str.startsWith("l")
    str.startsWith("L")

    arrayOf(1,2,3,4,5,6,7,8,9)
}