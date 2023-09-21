// Kotlin usa == para comparação estrutural e === para comparação de referência (endereço de memória).

fun main(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // true (Sets ignoram a ordem do elemento)
    println(authors === writers) // false

    val animesOne = listOf("Naruto", "Sword Art Online", "Tokyo Ghoul") // Listas consideram a ordem do elemento
    val animesTwo = listOf("Naruto", "Sword Art Online", "Tokyo Ghoul")

    println(animesOne == animesTwo) // true
    println(animesOne === animesTwo) // false
    
}