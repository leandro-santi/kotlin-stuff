package com.solitudeworks.basics

fun someCondition(): Boolean = true;

fun main(args: Array<String>) {

    var a: String = "Inicial" // var é uma variável mutável

    val b: Int = 1 // val é uma variável imutável

    // Kotlin faz inferência de tipo
    val c = 3
    val d = "Anakin Skywalker"

    println(a)
    println(b)
    println(c)
    println(d)

    var e: Int = 0
    // var e = 0
    println(e)

    val f: Boolean
    if(someCondition()) f = true
    else f = false
    println(f)

}
