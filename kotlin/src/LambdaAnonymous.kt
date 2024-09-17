fun main() {
    // Definindo uma lambda que recebe um número e retorna seu dobro
    val doubleNumber: (Int) -> Int = { number -> number * 2 }

    // Usando a lambda para dobrar um número
    val result = doubleNumber(5)

    // Imprimindo o resultado
    println("O dobro de 5 é: $result")
}
