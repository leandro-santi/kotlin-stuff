class MutableStack<T>(vararg items: T) { // Pilha Mutável de varargs de T (T se torna um tipo de parâmetro genérico)

    private val elements = items.toMutableList()

    fun push(element: T) = elements.add(element)

    fun peek(): T = elements.last()

    fun pop(): T = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"

}

// Os parâmetros de tipo são colocados antes do nome da função
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements) // E é um tipo genérico (Assim como T)

fun main() {

    val stack = mutableStackOf(0.62, 3.14, 2.7)
    // val stack = mutableStackOf<Double>(0.62, 3.14, 2.7)
    println(stack)
    stack.push(9.87)
    println(stack)
    stack.pop()
    println(stack)
    println(stack.peek())
    println(stack.size())

    for(i in 1..stack.size()){
        print("${stack.pop()} ")
    }

    println()
    println(stack)

}