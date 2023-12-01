data class Friend(var name: String, var age: Int, var about: String) {

    constructor() : this("", 0, "")

}

fun writeCreationLog(p: Friend) {

    println("A new person ${p.name} was created.")

}

fun main() {

    /*
        'also' works executing a given block and returning the object called.
        inside the block, the object is referenced by 'it'.
    */

    val jake = Friend("Jake", 30, "Android developer")
        .also {
            // println(name)
            writeCreationLog(it)
        }

}