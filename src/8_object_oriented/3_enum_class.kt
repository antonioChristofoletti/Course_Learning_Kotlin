package `8_object_oriented`

enum class Prioridade1 {
    BAIXA, MEDIA, ALTA
}

// override
enum class Prioridade2(val id: Int) {
    BAIXA(1){
        override fun toString(): String {
            return super.toString().toLowerCase()
        }
    },
    MEDIA(2),
    ALTA(10)
}

class Alarme(var desc: String, p : Prioridade2)

fun main() {
    println(Prioridade1.BAIXA)

    for (p in Prioridade2.values()) {

        if (p.toString() == "MEDIA") {
            println("Encontrou o elemento MEDIA")
        }

        println("$p - ${p.id} - ${p.ordinal}")
    }
}