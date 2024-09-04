fun main() {
    // Cabeçalho para a tabela de conversão
    println("Celsius\tFahrenheit")
    println("--------------------")

    // Loop para converter e exibir os valores de 10 a 100 graus Celsius
    for (celsius in 10..100 step 10) {
        // Convertendo Celsius para Fahrenheit
        val fahrenheit = (celsius * 9 / 5) + 32

        // Exibindo os valores
        println("$celsius\t$fahrenheit")
    }
}
