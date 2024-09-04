fun main() {
    var continuar = true

    while (continuar) {
        // Exibindo o menu
        println("Escolha uma opção:")
        println("1 - Fatorial")
        println("2 - Quadrado de um número")
        println("3 - Volume de uma lata")
        println("4 - Sair do Programa")

        // Lendo a opção do usuário
        val opcao = readLine()?.toIntOrNull()

        if (opcao != null) {
            when (opcao) {
                1 -> {
                    // Opção 1: Calcular o fatorial
                    println("Digite um número inteiro para calcular o fatorial:")
                    val numero = readLine()?.toIntOrNull()
                    if (numero != null) {
                        val resultadoFatorial = calcularFatorial(numero)
                        println("O fatorial de $numero é $resultadoFatorial")
                    } else {
                        println("Número inválido.")
                    }
                }
                2 -> {
                    // Opção 2: Calcular o quadrado de um número
                    println("Digite um número para calcular o quadrado:")
                    val numero = readLine()?.toDoubleOrNull()
                    if (numero != null) {
                        val resultadoQuadrado = calcularQuadrado(numero)
                        println("O quadrado de $numero é $resultadoQuadrado")
                    } else {
                        println("Número inválido.")
                    }
                }
                3 -> {
                    // Opção 3: Calcular o volume de uma lata
                    println("Digite o raio da lata (em cm):")
                    val raio = readLine()?.toDoubleOrNull()
                    println("Digite a altura da lata (em cm):")
                    val altura = readLine()?.toDoubleOrNull()
                    if (raio != null && altura != null) {
                        val resultadoVolume = calcularVolumeLata(raio, altura)
                        println("O volume da lata é $resultadoVolume cm³")
                    } else {
                        println("Raio ou altura inválidos.")
                    }
                }
                4 -> {
                    // Opção 4: Sair do programa
                    continuar = false
                    println("Saindo do programa...")
                }
                else -> {
                    println("Opção inválida. Tente novamente.")
                }
            }
        } else {
            println("Opção inválida. Tente novamente.")
        }
    }
}

// Função para calcular o fatorial de um número
fun calcularFatorial(n: Int): Long {
    if (n < 0) return 0 // Não é possível calcular o fatorial de um número negativo
    var resultado: Long = 1
    for (i in 1..n) {
        resultado *= i
    }
    return resultado
}

// Função para calcular o quadrado de um número
fun calcularQuadrado(numero: Double): Double {
    return numero * numero
}

// Função para calcular o volume de uma lata (cilindro)
fun calcularVolumeLata(raio: Double, altura: Double): Double {
    val pi = 3.14159
    return pi * raio * raio * altura
}
