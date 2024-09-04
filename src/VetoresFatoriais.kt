fun main() {
    // Número de elementos
    val tamanho = 5

    // Criar o vetor A e o vetor B
    val vetorA = IntArray(tamanho)
    val vetorB = IntArray(tamanho)

    // Solicitar valores para o vetor A
    println("Digite os valores para o vetor A:")
    for (i in 0..<tamanho) {
        print("Elemento ${i + 1}: ")
        vetorA[i] = readlnOrNull()?.toIntOrNull() ?: 0
    }

    // Calcular o fatorial para cada elemento do vetor A e armazenar no vetor B
    for (i in 0..<tamanho) {
        vetorB[i] = calcFatorial(vetorA[i])
    }

    // Mostrar os vetores
    println("Vetor A: ${vetorA.joinToString(", ")}")
    println("Vetor B: ${vetorB.joinToString(", ")}")
}

// Função para calcular o fatorial de um número
fun calcFatorial(n: Int): Int {
    if (n < 0) return 0 // O fatorial não é definido para números negativos
    var fatorial = 1
    for (i in 1..n) {
        fatorial *= i
    }
    return fatorial
}
