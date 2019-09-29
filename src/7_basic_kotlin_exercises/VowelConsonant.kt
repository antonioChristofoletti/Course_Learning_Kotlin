package `7_basic_kotlin_exercises`

val vowels = arrayOf('a', 'e', 'i','o','u')

fun countVowels(phrase: String): Int {
    return phrase.toLowerCase().replace(" ","").filter { vowels.contains(it) }.length
}

fun countConsonants(phrase: String): Int {
    return phrase.toLowerCase().replace(" ","").filter { !vowels.contains(it) }.length
}