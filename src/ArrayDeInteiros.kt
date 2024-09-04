fun main() {
    // Criar um array com 10 elementos
    val array = IntArray(10)

    // Preencher o array com valores de 1 a 10
    for (i in array.indices) {
        array[i] = i + 1
    }

    // Mostrar o array após a inserção dos elementos
    println(array.joinToString(", "))
}
