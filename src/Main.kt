fun main() {
    println("Qual operação você deseja fazer: soma, subtração, multiplicação, divisão? ")
    val resposta = readln()!!.toString()

    when(resposta){
        "soma" -> soma()
        "subtração" -> subtraçao()
        "divisão" -> divisao()
        "multiplicação" -> multiplicaçao()
    }
}

fun soma() {
    println("digite o primeiro valor: ")
    var valorUmSoma = readln()!!.toDouble()
    println("digite o segundo valor: ")
    var valorDoisSoma = readln()!!.toDouble()
    println(valorUmSoma + valorDoisSoma)
}

fun subtraçao() {
    println("digite o primeiro valor: ")
    var valorUmSubtraçao = readln()!!.toDouble()
    println("digite o segundo valor: ")
    var valorDoisSubtraçao = readln()!!.toDouble()
    println(valorUmSubtraçao - valorDoisSubtraçao)
}

fun multiplicaçao() {
    println("digite o primeiro valor: ")
    var valorUmMultiplicaçao = readln()!!.toDouble()
    println("digite o segundo valor: ")
    var valorDoisMultiplicaçao = readln()!!.toDouble()
    println(valorUmMultiplicaçao * valorDoisMultiplicaçao)
}

fun divisao() {
    println("digite o primeiro valor: ")
    var valorUmDivisao = readln()!!.toDouble()
    println("digite o segundo valor: ")
    var valorDoisDivisao = readln()!!.toDouble()
    println(valorUmDivisao / valorDoisDivisao)
}