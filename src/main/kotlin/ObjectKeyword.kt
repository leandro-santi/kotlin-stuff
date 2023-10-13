
// O objetivo do 'object keyword' é obter um tipo de dado com uma instância única (Singleton)

// Expression
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit { // Unit = void

    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")

}

// Declaration
object DoAuth { // Classe de instância única (Singleton)

    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }

}

// Companion
class BigBen {

    companion object Bonger { // Método static
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }

}

fun main() {

    rentPrice(10, 2, 1) // Expression

    println()

    DoAuth.takeParams("foo", "qwerty") // Declaration

    println()

    BigBen.getBongs(12) // Companion
    println()
    BigBen.Bonger.getBongs(12)

}