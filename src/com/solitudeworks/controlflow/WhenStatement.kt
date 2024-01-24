package com.solitudeworks.controlflow

class Statement

fun cases(obj: Any) { // Tipo Any é algo que pode receber qualquer coisa
    when (obj) { // When é similar a estrutura de switch case
        1 -> println("One") // Inteiro
        "Hello there!" -> println("Hello, Master!") // String
        is Long -> println("Long") // Tipo Long Int
        !is String -> println("Not a string") // Se não for String
        else -> println("Unknown") // Similar ao default de um switch case
    }
}

fun casesInt(num: Int) {
    when(num){
        1 -> println("Um (1)")
        2 -> println("Dois (2)")
        3 -> println("Três (3)")
        else -> println("-1")
    }
}

fun main() {
    cases("Hello there!")
    cases(1)
    cases(0L)
    cases(Statement())
    cases("hello")

    casesInt(2)
    casesInt(4)
}