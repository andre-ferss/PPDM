fun main() {
    // Lendo três valores inteiros do usuário
    println("Digite o primeiro valor:")
    val valor1 = readLine()!!.toInt()

    println("Digite o segundo valor:")
    val valor2 = readLine()!!.toInt()

    println("Digite o terceiro valor:")
    val valor3 = readLine()!!.toInt()

    // Colocando os valores em uma lista
    val valores = listOf(valor1, valor2, valor3)

    // Ordenando os valores em ordem crescente
    val valoresOrdenados = valores.sorted()

    // Imprimindo os valores em ordem crescente
    println("Os valores em ordem crescente são:")
    valoresOrdenados.forEach { println(it) }
}
