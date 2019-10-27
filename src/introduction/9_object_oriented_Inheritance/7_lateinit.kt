class Pessoa {
    lateinit var nome : String

    fun geradorDeNome(){
        nome = "nome"
    }
}

fun main(){
    val p = Pessoa()
    p.geradorDeNome()
}