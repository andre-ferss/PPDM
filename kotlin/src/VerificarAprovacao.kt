fun main() {
    // Lendo quatro valores de notas do usuário
    println("Digite a primeira nota:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toDouble()

    println("Digite a terceira nota:")
    val nota3 = readLine()!!.toDouble()

    println("Digite a quarta nota:")
    val nota4 = readLine()!!.toDouble()

    // Calculando a média
    val media = (nota1 + nota2 + nota3 + nota4) / 4

    // Verificando se o aluno foi aprovado ou não
    if (media >= 7) {
        println("O aluno foi aprovado com uma média de $media")
    } else {
        println("O aluno não foi aprovado. Média: $media")
    }
}
