fun main(){

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // filter -> Filtrar a partir de um predicado (regra)
    // A regra é aplicada para cada elemento da coleção
    // Se os elementos retornam true para a regra, eles são inseridos no resultado
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }

    println(positives)
    println(negatives)

    // map -> Transforma todos os elementos de uma coleção
    // Transformação de dados
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }

    println(doubled)
    println(tripled)

    val fruitsBag = listOf("apple","orange","banana","grapes")
    val clothesBag = listOf("shirts","pants","jeans")
    val cart = listOf(fruitsBag, clothesBag)

    val mapBag = cart.map { it } // Map gera uma matriz de duas listas

    // flatMap -> Transforma cada elemento de uma coleção em um objeto iteravel
    // Construindo uma única lista como resultado da transformação
    val flatMapBag = cart.flatMap { it }


    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")

}