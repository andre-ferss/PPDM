fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Digite o raio da lata de óleo (em unidades):")
    val raio = scanner.nextDouble()

    println("Digite a altura da lata de óleo (em unidades):")
    val altura = scanner.nextDouble()

    val pi = 3.14159
    val volume = pi * raio * raio * altura

    println("O volume da lata de óleo é ${"%.2f".format(volume)} unidades cúbicas.")
}
