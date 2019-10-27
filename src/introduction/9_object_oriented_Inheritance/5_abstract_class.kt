package introduction.`9_object_oriented_Inheritance`

abstract class Manifero(var nome: String){

    var peso: Float = 0f

    abstract fun falar()

    fun dormir(){}
}

class Cachorro(nome: String, peso : Float) : Manifero(nome){

    init {
        this.peso = peso
    }

    override fun falar() {

    }
}

class Gato(nome: String) : Manifero(nome){

    override fun falar() {

    }
}

fun main(){
    Cachorro("Dog", 100f).dormir()
}