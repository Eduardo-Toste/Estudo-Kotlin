package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("Numero X: $numeroX")
    println("Numero Y: $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 1001)
    contaJoao.titular = joao

    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)

    var contaMaria = ContaCorrente(maria, 1003)
    contaMaria.titular = maria

    println("Titular conta João: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}