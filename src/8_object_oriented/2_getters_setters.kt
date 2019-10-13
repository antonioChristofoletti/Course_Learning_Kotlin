package `8_object_oriented`

class Maquina2(var marca: String){

    var criadoAutomaticamente : String = "" // Getter and setter são criados automaticamente em kotlin

    var nucleos : Int = 0
        get(){
            println("Get foi chamado")
            return field
        }
        set(value){
            println("Set foi chamado")
            this.nucleos = value
        }

    fun ligar(){
        println("Ligando...")
    }

    fun processar(){
        println("Processando...")
    }

    fun desligar(){
        println("Desligando...")
    }
}

fun main(){
    val m = Maquina2("test123")


    with(m){
        ligar()
        processar()
        desligar()
    }
}