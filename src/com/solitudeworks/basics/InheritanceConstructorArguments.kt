package com.solitudeworks.basics

open class Dog(val name: String, val origin: String){

    open fun speak() = println("The dog $name from $origin says: Ruf Ruf!")

}

class Cachorro(name: String) : Dog(name = name, origin = "Brazil")

fun main(){

    val dog: Dog = Cachorro("Tobi")
    dog.speak()

}