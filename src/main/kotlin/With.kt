class Configuration(val host: String, val port: Int)

fun main() {

    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) { // this
        println("$host:$port")
    }

    // instead of:
    println("${configuration.host}:${configuration.port}")

    configuration.run { // Using run
        println("$host:$port")
    }

    configuration.let { // Using let
        println("${it.host}:${it.port}")
    }

}