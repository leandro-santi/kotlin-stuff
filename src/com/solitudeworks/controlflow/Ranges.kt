package com.solitudeworks.controlflow
// Intervalos

fun main(){

    // for(i=0; i<=3; i++)
    for(i in 0..3) println(i) // Inclusive o 3

    println()

    for(i in 0 until 3){ // Exclusive o 3
        println(i)
    }

    println()

    for(i in 0..<3){ // Exclusive o 3
        println(i)
    }

    println()

    for(i in 2..8 step 2){
        println(i)
    }

    println()

    for(i in 9 downTo 0 step 3){
        println(i)
    }

    println()

    for (c in 'a'..'d') {
        print(c)
    }

    println()

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }

    println()

    val x = 2

    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }

    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }

    println()

}