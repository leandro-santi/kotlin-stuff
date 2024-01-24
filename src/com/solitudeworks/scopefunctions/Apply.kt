package com.solitudeworks.scopefunctions

data class Man(var name: String, var age: Int, var about: String) {

    constructor() : this("", 0, "")

    override fun toString(): String {
        return "Name: $name, Age: $age, About: $about"
    }

}

fun main() {

    /*
        'apply' executes a block of code on an object and returns the object itself.
        inside the block, the object is referenced by 'this'.
        inside 'apply', it's equivalent to jake.name = "Jake".
    */
    
    val jake = Man()

    val stringDescription = jake.apply {
        name = "Jake" // this.name equivalent to jake.name
        age = 30
        about = "Android developer"
    }.toString()

    println(stringDescription)

    println(jake.toString())

}