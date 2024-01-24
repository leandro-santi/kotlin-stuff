package com.solitudeworks.specialclasses
// Uma sealed class só pode ser herdada por subclasses que estão no mesmo pacote (pasta) da classe selada
sealed class Mammal(val name: String)

class Lion(val lionName: String) : Mammal(lionName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {

    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Lion -> return "Hello ${mammal.name}"
    }

}

fun main() {

    println(greetMammal(Lion("Mufasa")))

    val worker = Human("Leandro", "Game Developer on LUDUS Lab")
    println(greetMammal(worker))

}