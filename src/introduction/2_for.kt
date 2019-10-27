package introduction

fun main(){

    val nome = "Antonio"

    for(caracter in nome)
        print("$caracter ")

    println("");

    for(i in 0..100 step 5){
        print("$i ")
    }

    println("");

    for(i in 100 downTo 0 step 10){
        print("$i ")
    }

}