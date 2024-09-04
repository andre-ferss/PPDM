fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Digite o valor da variável A:")
    var a = scanner.nextInt()

    println("Digite o valor da variável B:")
    var b = scanner.nextInt()

    println("Valores originais:")
    println("A = $a")
    println("B = $b")

    // Troca os valores
    val temp = a
    a = b
    b = temp

    println("Valores após a troca:")
    println("A = $a")
    println("B = $b")
}
