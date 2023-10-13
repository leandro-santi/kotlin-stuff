data class Friend(var name: String, var age: Int, var about: String) {

    constructor() : this("", 0, "")

}

fun writeCreationLog(p: Friend) {

    println("A new person ${p.name} was created.")

}

fun main() {

    val jake = Friend("Jake", 30, "Android developer")
        .also {
            writeCreationLog(it)
        }

}