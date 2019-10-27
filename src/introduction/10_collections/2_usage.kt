package introduction.`10_collections`

data class Food(val name: String, val calories: Double, val ingredients: List<Ingredients> = listOf())

data class Ingredients(val name: String, val quantity: Int)

fun hasIngredients(list: List<Ingredients>, name: String) = list.filter { it.name == name}.any()

fun main(args: Array<String>) {

    val food1 = Food(
        "lasanha", 1200.0,
        listOf(
            Ingredients("Farinha", 1),
            Ingredients("Presunto", 1),
            Ingredients("Queijo", 1),
            Ingredients("Molho de Tomate", 1),
            Ingredients("Manjerição", 1)
        )
    )

    val food2 = Food(
        "Hamburguer", 2000.0,
        listOf(
            Ingredients("Pão", 1),
            Ingredients("Hamburguer", 3),
            Ingredients("Catupiry", 1),
            Ingredients("Bacon", 3),
            Ingredients("Alface", 1),
            Ingredients("Tomate", 1)
        )
    )

    val food3 = Food("Panqueca", 500.0)

    val food4 = Food("Omelete", 200.0)

    val food5 = Food("Parmegiana", 700.0)

    val food6 = Food("Sopa de Feijão", 300.0)

    val data = listOf(food1, food2, food3, food4, food5, food6)

    // Tenho receitas na Lista?

    println("Tenho receitas? ${if (data.any()) "sim" else "não"}")

    // Quantas receitas tenho na coleção?

    println("Quantas receitas tenho na coleção? ${data.count()} receitas")

    // Qual a primeira e a última receita?

    println("A 1º receita é ${data.first().name} e a última é ${data.last().name}")

    // Qual a soma de calorias?

    val sumCalories = data.sumByDouble { it.calories }

    println("Qual a soma de calorias? ${sumCalories}")

    // Me dê as duas primeiras receitas!

    println("Me dê as duas primeiras receitas!  ${data.take(2).map { it.name }}")

    // Sei como fazer panquenca? e Sushi?
    val knowPanqueca = data.filter{it.name == "Panqueca"}.any()
    val knowSushi = data.filter{it.name == "Panqueca"}.any()

    println("Sei fazer panquenca? ${if(knowPanqueca) "Sim" else "Nao"}")

    println("Sei fazer sushi? ${if(knowSushi) "Sim" else "Nao"}")

    // Quais são as comidas com mais de 500 calorias?

    data.filter{it.calories > 500}.forEach{ println(it.name)}

    // Par(chave, valor) de comidas com mais de 500 calorias(name, calories)
    data.filter{it.calories > 500}.map{ Pair(it.name, it.calories)}.forEach { println("${it.first}: ${it.second}") }

    println("Quais receitas possui farinha como ingredientes?")

    // Quais receitas possui farinha como ingredientes?

    // resolution 1
    data.filter{ it.ingredients.filter { it.name == "Farinha" }.any()}.forEach { println(it.name) }

    // resulotio 2
    data.filter { hasIngredients(it.ingredients, "Farinha") }.forEach { println(it.name) }
}