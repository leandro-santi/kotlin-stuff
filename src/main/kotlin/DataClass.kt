data class User(val name: String, val id: Int) {

    override fun equals(other: Any?) =
        other is User && other.id == this.id

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + id
        return result
    }

    override fun toString(): String {
        return "Name: $name | Id: $id"
    }

}

fun main() {

    /*
    'data class' make it easy to create classes that are used to store values and using it.
    this class provides some main methods for use in the class's stored values.
    these main methods are 'equals()', 'hashCode()', 'toString()', 'componentN()' and 'copy()'.
    */

    val user = User("Alex", 1)

    // 'toString()' -> creates a string representation from de class's instance
    println(user.toString())

    println()

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    // 'equals()' -> compares the contents of the classes and if they are equal
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")
    println(user.equals(thirdUser.copy(id = 1)))

    println()

    // 'hashCode()' -> generates a unique int value to represent the class content
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println()

    // 'copy()' -> creates a copy from de data class instance with a new memory address
    println(user.copy())
    println(user === user.copy()) // copy is diff in memory address
    println(user.copy(name = "Max")) // copy changing parameter value
    println(user.copy(id = 3))

    println()

    // 'componentN()' -> allow individual access to class's instance properties
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}