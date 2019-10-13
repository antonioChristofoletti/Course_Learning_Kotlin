package `9_object_oriented_Inheritance`

open class Maquina1(val marca: String){

    // The reserved word 'open' allows the override
    open fun minhaMarca(){
        println("Minha marca é $marca")
    }
}

class Computador1(marca:String, val nucleos:Int) : Maquina1(marca){

    override fun minhaMarca() {
        super.minhaMarca()
    }

    //Overload

    fun overload(i : Int) = println("eba")
    fun overload(i : String) = println("eba1")
    fun overload(i : Double) = println("eba2")

}

fun main() {
    val c: Computador1 = Computador1("xpto", 10)

    with(c){
        overload(1)
        overload(1.2)
        overload("eba")
    }
}