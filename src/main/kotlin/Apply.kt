data class Man(var name: String, var age: Int, var about: String) {

    constructor() : this("", 0, "")

}

fun main() {

    val jake = Man()

    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()

    println(stringDescription)
    println(jake.toString())

}