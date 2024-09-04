fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Digite a temperatura em graus Fahrenheit:")
    val fahrenheit = scanner.nextDouble()

    val celsius = (fahrenheit - 32) * (5.0 / 9.0)

    println("A temperatura de $fahrenheit°F em Celsius é ${"%.2f".format(celsius)}°C.")
}
