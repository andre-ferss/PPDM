fun main() {
    // Criando uma lista de números inteiros
    val numbers = listOf(1, 2, 3, 4, 5)

    // Usando reduce para calcular a soma dos números
    val sum = numbers.reduce { acc, number -> acc + number }

    // Imprimindo o resultado da soma
    println("A soma dos números é: $sum")
}
