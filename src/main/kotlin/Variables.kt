fun SomeCondition(): Boolean = true;

fun main(args: Array<String>) {

    var a: String = "Inicial" // var é uma variável mutável

    val b: Int = 1 // val é uma variável imutável
    val c = 3 // Kotlin tem inferência de tipo
    val d = "Anakin Skywalker"

    println(a)
    println(b)
    println(c)
    println(d)

    var e: Int = 0
    println(e)

    val f: Boolean
    if(SomeCondition()) f = true
    else f = false
    println(f)

}
