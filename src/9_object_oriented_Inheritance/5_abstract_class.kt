package `9_object_oriented_Inheritance`

abstract class Manifero(var nome: String){
    abstract fun falar()
}

class Cachorro(nome: String) : Manifero()