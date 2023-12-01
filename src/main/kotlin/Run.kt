fun main() {

    /*
        it's similar to 'let'.
        'run' works executing a given block and returning its result.
        inside the block, the object is referenced by 'this'.
    */

    fun printAnimeName(anime: String?) {

        anime?.run {
            println("Anime: $anime")
            println("Anime's name length: $length")
        }

    }

    printAnimeName(null)
    println("Naruto")

}