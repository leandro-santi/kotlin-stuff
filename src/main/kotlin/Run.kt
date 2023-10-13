
// Run executa um bloco de código e retorna seu resultado

fun main() {

    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length
        }
    }

    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}