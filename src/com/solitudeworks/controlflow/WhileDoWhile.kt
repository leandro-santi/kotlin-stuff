package com.solitudeworks.controlflow

fun speakObiWan() = println("Obi-Wan Kenobi: Hello there!")

fun speakAnakin() = println("Anakin: Hello master!!")

fun main(args: Array<String>) {

    var countObi = 0; var countAni = 0

    // while loop
    while(countObi < 3){
        speakObiWan()
        countObi++
    }

    println()

    // do-while Loop
    do{
        speakAnakin()
        countAni++
    }while (countAni < countObi)

}