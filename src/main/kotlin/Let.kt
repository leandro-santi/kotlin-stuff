
// Let executa um bloco de código e retorna seu resultado

fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {

    val empty = "test".let {
        customPrint(it)
        it.isEmpty() // Boolean
    }
    println(" is empty: $empty")

    println()

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let { // Executa somente se a string não for nula
            // print("\t") // Tabulação
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) { // Lets encadeados
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")

}