package `10_collections`

fun main(args: Array<String>) {


    val l1 = listOf("Madrid", "Singapura", "São Paulo")
    val l2 = mutableListOf("Madrid", "Singapura", "São Paulo")
    val a1 = arrayListOf("Madrid", "Singapura", "São Paulo") // Came from Java

    val s1 = setOf("Madrid", "Singapura", "São Paulo") // Set doesnt allow equal values on the list
    val s2 = mutableSetOf("Madrid", "Singapura", "São Paulo")

    val h1 = hashMapOf<String, String>(Pair("key", "value"), Pair("França", "Paris"))
    println(h1.entries)
    println(h1["França"])

    val m1 = mapOf(Pair("key", "value"), Pair("França", "Paris"))
    val m2 = mutableMapOf(Pair("key", "value"), Pair("França", "Paris"))
}