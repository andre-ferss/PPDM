fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Digite o primeiro número:")
    val num1 = scanner.nextDouble()

    println("Digite o segundo número:")
    val num2 = scanner.nextDouble()

    val resultado = num1 * num2

    println("A multiplicação de $num1 por $num2 é $resultado.")
}
