fun main() {
    // Lendo um número inteiro do usuário
    println("Digite um número inteiro:")
    val numero = readLine()!!.toInt()

    // Verificando se o número é par ou ímpar
    if (numero % 2 == 0) {
        println("O número $numero é par.")
    } else {
        println("O número $numero é ímpar.")
    }
}
