package introduction.`8_object_oriented`

class Pessoa1

class Pessoa2(var nome: String, var anoNascimento: Int)

class Pessoa3(var nome: String) { // <-- First Constructor

    var anoNascimento: Int? = null

    constructor(nome: String, anoNascimento: Int) : this(nome) {
        this.anoNascimento = anoNascimento
    }

    fun saudacao() {
        println("Olá, meu nome é $nome e nasci no ano $anoNascimento")
    }
}

fun main() {
    val p1: Pessoa3 =
        Pessoa3("Antonio", 2019)
    val p2: Pessoa3 = Pessoa3("Antonio")

    p1.saudacao()
    p2.saudacao()
}