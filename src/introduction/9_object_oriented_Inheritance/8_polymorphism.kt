interface Funcionario {
    fun calculaBonus()
}

class Gerente : Funcionario{
    override fun calculaBonus() {
        println("Bonus: 500")
    }
}


class Tecnico : Funcionario{
    override fun calculaBonus() {
        println("Bonus: 400")
    }
}


class Analista : Funcionario{
    override fun calculaBonus() {
        println("Bonus: 300")
    }
}
fun main(){

    val f1 : Funcionario = Gerente()
    val f2 : Funcionario = Tecnico()
    val f3 : Funcionario = Analista()

    calculo(f1)
    calculo(f2)
    calculo(f3)
}

fun calculo(f : Funcionario) {
    // do something
}