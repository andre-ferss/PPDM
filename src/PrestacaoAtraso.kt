fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Digite o valor da prestação (em unidades monetárias):")
    val valor = scanner.nextDouble()

    println("Digite a taxa de juros (em porcentagem):")
    val taxa = scanner.nextDouble()

    println("Digite o tempo de atraso (em períodos):")
    val tempo = scanner.nextDouble()

    val prestacao = valor + (valor * (taxa / 100) * tempo)

    println("O valor da prestação em atraso é ${"%.2f".format(prestacao)} unidades monetárias.")
}
