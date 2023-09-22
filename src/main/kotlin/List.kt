// Uma Lista é uma estrutura de dados ordenada
// Pode ser mutável ou imutável

// List<T> -> listOf() sempre vai criar uma lista read-only (imutável)
// MutableList<T> -> mutableListOf() vai criar uma lista mutável

// A variável é imutável (val), mas a lista mutável instanciada pode ser modificada
val original: MutableList<Int> = mutableListOf(1, 2, 3)

// Qualquer modificação na original reflete na lista view
val view: List<Int> = original // Copia read-only de systemUsers, é uma view de leitura da lista original

fun addOnOriginal(newUser: Int) {
    original.add(newUser) // Adiciona na lista mutável
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