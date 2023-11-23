fun main() {

    // Lambda function
    var soma: ((Int, Int) -> Int) = { a, b -> a + b }
    println(soma(1, 2))

}