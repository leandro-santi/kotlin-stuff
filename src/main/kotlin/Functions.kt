fun printMessage(message: String): Unit { // Unit é como se fosse um retorno vazio / nada
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    // Caso não seja especificado um valor para prefix, o valor "Info" vai ser usado como valor padrão
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int { // Retorno explícito de um inteiro
    return x + y
}

// Inline Function
fun multiply(x: Int, y: Int) = x * y // Retorno implícito de um valor inteiro resultado da multiplicação

fun main(args: Array<String>) {

    // println("Hello World!")
    printMessage("Star Wars")
    printMessageWithPrefix("Hello there!!")
    printMessageWithPrefix("Hello there!!", "Obi-Wan Kenobi")
    printMessageWithPrefix(prefix = "Anakin", message = "Hello, Master")

    println(sum(1, 2))
    println(multiply(2, 2))

}
