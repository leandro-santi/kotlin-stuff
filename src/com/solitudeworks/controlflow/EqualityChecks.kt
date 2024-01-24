package com.solitudeworks.controlflow
// Kotlin usa '==' para comparação estrutural e '===' para comparação de referência (endereço de memória).

fun main(){

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // true (Sets ignoram a ordem dos elementos)
    println(authors === writers) // false

    val animesOne = listOf("Naruto", "Sword Art Online", "Tokyo Ghoul")
    val animesTwo = listOf("Naruto", "Sword Art Online", "Tokyo Ghoul")

    println(animesOne == animesTwo) // true (Listas consideram a ordem dos elementos)
    println(animesOne === animesTwo) // false

}