class Expression

fun whenAssign(obj: Any): Any { // Tipo Any é algo que pode receber / retornar qualquer coisa
    val result = when (obj) { // Resultado recebe o que for selecionado do when
        1 -> "Um"
        "Hello there!" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

fun whenIntAssign(num: Int): String {
    val result = when (num) {
        1 -> "Um!"
        2 -> "Dois!"
        3 -> "Três!"
        else -> "Desconhecido"
    }
    return result
}

fun main() {

    println(whenAssign("Hello there!"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(Expression()))

    println(whenIntAssign(1))
    println(whenIntAssign(2))
    println(whenIntAssign(3))
    println(whenIntAssign(4))

}