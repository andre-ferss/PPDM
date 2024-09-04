fun main() {
    // Criar a coleção A com valores de 1 a 10
    val colecaoA = List(10) { it + 1 }

    // Criar a coleção B, onde cada elemento é o correspondente em coleção A multiplicado por 2
    val colecaoB = colecaoA.map { it * 2 }

    // Mostrar as duas coleções
    println("Coleção A: ${colecaoA.joinToString(", ")}")
    println("Coleção B: ${colecaoB.joinToString(", ")}")
}
