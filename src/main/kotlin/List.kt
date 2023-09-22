// Uma Lista é uma estrutura de dados ordenada

// listOf() Imutável (read-only)
// mutableListOf() Mutável

// A variável é imutável (val), mas a lista mutável instanciada pode ser modificada
val original: MutableList<Int> = mutableListOf(1, 2, 3)

// Qualquer modificação na original reflete na lista view
val view: List<Int> = original // Copia em modo read-only da lista original

fun addOnOriginal(newUser: Int) {
    original.add(newUser)
}

fun getViewList(): List<Int> {
    return view
}

fun main() {

    addOnOriginal(4)
    addOnOriginal(5)
    addOnOriginal(6)

    println("Size: ${getViewList().size}")

    getViewList().forEach {
            i -> println("Counter: $i")
    }
    // getViewList().add(5) <- Error!

}