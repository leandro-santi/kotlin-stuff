class Configuration(val host: String, val port: Int)

fun main() {

    /*
        'with' can access members of its argument concisely.
        you can omit the instance name when referring to its members.
    */

    val configuration = Configuration(host = "127.0.0.1", port = 9000)

    with(configuration) {
        println("$host:$port")
    }

    println("${configuration.host}:${configuration.port}")

    configuration.let {
        println("${it.host}:${it.port}")
    }

    configuration.run {
        println("$host:$port")
    }

    configuration.apply {
        println("${host}:${port}")
    }

    configuration.also {
        println("${it.host}:${it.port}")
    }

}