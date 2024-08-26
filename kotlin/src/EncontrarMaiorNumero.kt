fun main() {
    // Lendo três valores inteiros do usuário
    println("Digite o primeiro número:")
    val numero1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val numero2 = readLine()!!.toInt()

    println("Digite o terceiro número:")
    val numero3 = readLine()!!.toInt()

    // Encontrando o maior número
    val maiorNumero = maxOf(numero1, numero2, numero3)

    // Exibindo o maior número
    println("O maior número é: $maiorNumero")
}
