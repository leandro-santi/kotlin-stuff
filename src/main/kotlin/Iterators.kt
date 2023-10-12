class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    // O nome da função deve ser iterator e deve ter um modificador operator antes da assinatura
    operator fun iterator(): Iterator<Animal> { // Cria a capacidade de ser iterado
        return animals.iterator()
    }

}

class Character(val name: String)

class Anime(val characters: List<Character>){
    operator fun iterator(): Iterator<Character> {
        return characters.iterator()
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion"), Animal("neko")))

    for (animal in zoo) {
        println("Look!!!, it's a ${animal.name}")
    }

    println()

    val characters = listOf(Character("Naruto"), Character("Sasuke"), Character("Itachi"))
    val anime = Anime(characters)

    for (character in anime) {
        println("${character.name}!!!!!")
    }

}