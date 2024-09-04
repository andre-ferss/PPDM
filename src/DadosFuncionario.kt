fun main() {
    // Ler os dados do funcionário
    print("Digite o nome do funcionário: ")
    val nome = readlnOrNull() ?: "Desconhecido"

    print("Digite o salário bruto: ")
    val salarioBruto = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    print("Digite o valor do desconto: ")
    val desconto = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    // Calcular o salário líquido
    val salarioLiquido = salarioLiquido(salarioBruto, desconto)

    // Mostrar os dados do funcionário
    println("Dados do Funcionário:")
    println("Nome: $nome")
    println("Salário Líquido: R$ %.2f".format(salarioLiquido))

    // Ler a porcentagem de aumento
    print("Digite a porcentagem de aumento: ")
    val porcentagemAumento = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    // Aplicar o aumento
    val salarioAumentado = aumentarSalario(salarioLiquido, porcentagemAumento)

    // Mostrar os dados atualizados do funcionário
    println("Dados Atualizados do Funcionário:")
    println("Nome: $nome")
    println("Salário Líquido Atualizado: R$ %.2f".format(salarioAumentado))
}

// Função para calcular o salário líquido
fun salarioLiquido(salarioBruto: Double, desconto: Double): Double {
    return salarioBruto - desconto
}

// Função para aumentar o salário baseado na porcentagem dada
fun aumentarSalario(salario: Double, porcentagem: Double): Double {
    val aumento = salario * porcentagem / 100
    return salario + aumento
}
