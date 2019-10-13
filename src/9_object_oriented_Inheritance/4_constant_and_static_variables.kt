package `9_object_oriented_Inheritance`

class Constants{

    companion object BANCO{
        val TABLE = "Pessoa"

        fun teste(){

        }
    }

    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS {
            val ID = "Id"
            val TOTAL = "Total"
        }
    }
}

fun main(){
    println(Constants.TABLE)
    Constants.teste()
}