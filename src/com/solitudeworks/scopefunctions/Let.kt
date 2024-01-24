package com.solitudeworks.scopefunctions

fun main() {

    /*
        'let' can be used for scope functions and null-checks.
        inside the block, the object is referenced by 'it' or a custom name.
        returns only thw result of its last expression.
    */

    fun customPrint(s: String) {
        print(s.uppercase())
    }

    val anime = "Naruto".let {
        customPrint(it)
        it.isEmpty() // returning the boolean result (last expression)
    }
    println(" is empty: $anime\n")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {
            customPrint(it)
            println()
        }
    }

    printNonNull(null)
    printNonNull("Naruto")

}