
// Todas as exceptions classes herdam da classe 'Throwable'

fun main(){

//    throw Exception("Hello there!")

//    try {
//        // some code
//    } catch (e: SomeException) {
//        // handler
//    } finally {
//        // optional finally block
//    }

    val a = 10; val b = 2

    // val div = a/b

    try {
        val div = a/b
        println(div)
    }catch (exception: Throwable){ // ArithmeticException: / by zero
        // exception.printStackTrace()
        // println("Error!")
        println(exception.message)
    }finally {
        println("Success!")
    }

    val input = readln()

    // try .. catch é uma expressão, logo o valor retornado é o último comando de try ou o último comando de catch
    val x: Int? = try {
        input.toInt()
    } catch (e: NumberFormatException) {
        null
    }

    println(x)

    val c = 0

    val div = try{ a/c } catch (e: ArithmeticException) { 0 }
    println(div)

}