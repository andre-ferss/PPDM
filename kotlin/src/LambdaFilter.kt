data class Persona(val name: String, val age: Int)

fun main() {
    // Criando uma lista de pessoas
    val people = listOf(
        Persona("Alice", 30),
        Persona("Bob", 25),
        Persona("Charlie", 35),
        Persona("Diana", 28)
    )

    // Filtrando pessoas que têm 30 anos ou mais usando filter
    val adults = people.filter { it.age >= 30 }

    // Imprimindo a lista filtrada
    println("Pessoas com 30 anos ou mais:")
    for (person in adults) {
        println("${person.name} - ${person.age} anos")
    }
}
