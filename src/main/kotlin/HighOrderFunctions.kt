fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {

    return operation(x, y)

}

fun operation(): (Int) -> Double {

    return ::square // '::' aciona uma função pelo nome

}

fun makeSum(x: Int, y: Int) = x + y

fun makeSub(x: Int, y: Int) = x - y

fun square(x: Int) = (x * x).toDouble()

fun main() {

    val sumResult = calculate(4, 5, :: makeSum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    val subResult = calculate(4, 5, :: makeSub)

    println("sumResult $sumResult, mulResult $mulResult, subResult $subResult")

    println()

    val func = operation()
    println(func(2))

}