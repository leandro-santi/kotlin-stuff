
// Funções ad-hoc (para determinada finalidade)

fun main() {

    // (String) -> String (Recebe uma String e retorna uma String)
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }

    val upperCase2: (String) -> String = { str -> str.uppercase() }

    val upperCase3 = { str: String -> str.uppercase() }

    // val upperCase4 = { str -> str.uppercase() }

    val upperCase5: (String) -> String = { it.uppercase() }

    val upperCase6: (String) -> String = String::uppercase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}