package com.solitudeworks.basics

open class Cat(val origin: String){

    open fun speak() = println("A cat from $origin says: Meow!")

}

class Gato : Cat(origin = "Brazil"){

    override fun speak() {
        println("A cat from $origin says: Miau!")
    }

}

fun main(){

    val cat: Cat = Gato()
    cat.speak()

}