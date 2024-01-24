package com.solitudeworks.controlflow

fun main(){

    fun max(a: Int, b: Int) = if (a > b) a else b // Similar a um operador condicional ternário

    fun min(a: Int, b: Int): Any{
        return if (a < b) a else b
    }

    println(max(5, 6))
    println(min(5, 6))

}