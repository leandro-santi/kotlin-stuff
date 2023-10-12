
// Herança (POO)

// Em kotlin, classes são fechadas por padrão
open class Bird{ // O modificador 'open' permite que a classe seja aberta para ser herdada por outra classe (Herança)

    open fun fly() = println("Flying!")

    fun sing() = println("Singing!") // Por não ser 'open', essa função não pode ser sobrescrita

}

class Tux : Bird(){

    override fun fly() {
        println("Oh no! I can't fly :(. I'm a penguin!")
    }

}

fun main(){

    val tux: Bird = Tux()
    tux.fly()
    tux.sing()

    val bird = Bird()
    bird.fly()

}