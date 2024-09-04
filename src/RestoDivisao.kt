fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Digite um número inteiro:")
    val numero = scanner.nextInt()

    val resto = numero % 6

    println("O resto da divisão de $numero por 6 é $resto.")
}
