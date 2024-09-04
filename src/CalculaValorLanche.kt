fun main() {
    // Exibindo o cardápio da lanchonete
    println("Cardápio da Lanchonete:")
    println("100 - Cachorro quente - R\$ 1,20")
    println("101 - Bauru simples - R\$ 1,30")
    println("102 - Bauru com ovo - R\$ 1,50")
    println("103 - Hambúrguer - R\$ 1,20")
    println("104 - Cheeseburguer - R\$ 1,30")
    println("105 - Refrigerante - R\$ 1,00")

    // Lendo o código do item
    println("Digite o código do item pedido:")
    val codigo = readLine()!!.toInt()

    // Lendo a quantidade do item
    println("Digite a quantidade:")
    val quantidade = readLine()!!.toInt()

    // Inicializando o preço do item
    val preco: Double = when (codigo) {
        100 -> 1.20
        101 -> 1.30
        102 -> 1.50
        103 -> 1.20
        104 -> 1.30
        105 -> 1.00
        else -> {
            println("Código do item inválido!")
            return
        }
    }

    // Calculando o valor total
    val valorTotal = preco * quantidade

    // Exibindo o valor a ser pago
    println("O valor a ser pago é: R\$ ${"%.2f".format(valorTotal)}")
}
