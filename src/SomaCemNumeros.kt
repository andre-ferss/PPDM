fun main() {
    // Inicializando a variável para armazenar a soma
    var soma = 0

    // Calculando a soma dos primeiros 100 números inteiros
    for (i in 1..100) {
        soma += i
    }

    // Exibindo o total da soma
    println("A soma dos primeiros 100 números inteiros é: $soma")
}
