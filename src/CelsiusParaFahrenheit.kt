fun main() {
    val scanner = java.util.Scanner(System.`in`)

    println("Digite a temperatura em graus Celsius:")
    val celsius = scanner.nextDouble()

    val fahrenheit = (9 * celsius + 160) / 5

    println("A temperatura de $celsius°C em Fahrenheit é $fahrenheit°F.")
}
