package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X: $numeroX")
    println("Numero Y: $numeroY")

    val contaJoao = ContaCorrente("João", 1001)
    contaJoao.titular = "João"
    var contaMaria = ContaCorrente("Maria", 1003)
    contaMaria.titular = "Maria"

    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}