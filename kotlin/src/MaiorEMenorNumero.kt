fun main() {
    // Inicializando as variáveis para o maior e o menor valor com valores extremos
    var maiorNumero = Int.MIN_VALUE
    var menorNumero = Int.MAX_VALUE

    // Lendo cinco números inteiros do usuário
    for (i in 1..5) {
        println("Digite o $i número:")
        val numero = readLine()!!.toInt()

        // Atualizando o maior número se o número atual for maior
        if (numero > maiorNumero) {
            maiorNumero = numero
        }

        // Atualizando o menor número se o número atual for menor
        if (numero < menorNumero) {
            menorNumero = numero
        }
    }

    // Exibindo o maior e o menor número
    println("O maior número é: $maiorNumero")
    println("O menor número é: $menorNumero")
}
