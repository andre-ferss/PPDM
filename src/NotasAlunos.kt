fun main() {
    // Número de alunos
    val numAlunos = 5

    // Criar vetores para armazenar as notas
    val notasPrimeiraProva = DoubleArray(numAlunos)
    val notasSegundaProva = DoubleArray(numAlunos)

    // Receber as notas dos alunos
    for (i in 0..<numAlunos) {
        println("Digite a nota da primeira prova do aluno ${i + 1}: ")
        notasPrimeiraProva[i] = readlnOrNull()?.toDoubleOrNull() ?: 0.0

        println("Digite a nota da segunda prova do aluno ${i + 1}: ")
        notasSegundaProva[i] = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    }

    // Calcular e mostrar a média de cada aluno
    for (i in 0..<numAlunos) {
        val media = (notasPrimeiraProva[i] + notasSegundaProva[i]) / 2
        println("A média do aluno ${i + 1} é: %.2f".format(media))
    }
}
