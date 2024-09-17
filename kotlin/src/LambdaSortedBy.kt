data class Person(val name: String, val age: Int)

fun main() {
    // Criando uma lista de pessoas
    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35),
        Person("Diana", 28)
    )

    // Ordenando a lista de pessoas por idade usando sortedBy
    val sortedByAge = people.sortedBy { it.age }

    // Imprimindo a lista ordenada por idade
    println("Pessoas ordenadas por idade:")
    for (person in sortedByAge) {
        println("${person.name} - ${person.age} anos")
    }
}
