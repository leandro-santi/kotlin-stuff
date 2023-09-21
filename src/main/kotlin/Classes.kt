class Customer // Classe simples, sem nada. O cabeçalho e corpo são opcionais.

class Contact(val id: Int, val email: String)

class Person(){

    private var name: String = ""
    private var age = 0

//    fun CreatPerson(name: String){
//        this.name = name
//    }

    constructor(name: String) : this() { // Construtor padrão
        this.name = name
    }

    constructor(name: String, age: Int) : this() { // Construtor padrão
        this.name = name
        this.age = age
    }

    fun GetName() = this.name

    fun GetAge() = this.age
}

fun main(){

    val customer = Customer() // Não é necessário a alocação de memória com o comando new

    val contact = Contact(0, "coder@gmail.com")

    println("${contact.id} / ${contact.email}")

    val PersonOne = Person("Leandro")
    val PersonTwo = Person("Leandro", 20)
    //Person.CreatPerson("Leandro")
    println(PersonOne.GetName())
    println(PersonTwo.GetAge())
}