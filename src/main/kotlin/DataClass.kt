data class User(val name: String, val id: Int) {

    override fun equals(other: Any?) =
        other is User && other.id == this.id

//    override fun hashCode(): Int {
//        var result = name.hashCode()
//        result = 31 * result + id
//        return result
//    }

}

fun main() {

    val user = User("Alex", 1)
    println(user)

    println()

    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println()

    // hashCode() function para gerar um valor a partir dos atributos da classe
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println()

    // copy() function para criar uma cópia com uma referência de memória diferente (nova instância)
    println(user.copy())
    println(user === user.copy()) // Comparação da referência de memória
    println(user.copy("Max"))
    println(user.copy(id = 3))

    println()

    // componentN() function recebe os valores de atributos da classe em ordem de declaração
    println("name = ${user.component1()}")
    println("id = ${user.component2()}")

}