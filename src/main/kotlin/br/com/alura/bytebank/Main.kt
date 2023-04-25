package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    val endereco1 = Endereco()
    val endereco2 = Endereco()

    println(endereco1.equals(endereco2))

    println(endereco1.hashCode())
    println(endereco2.hashCode())

    println(endereco1.toString())
    println(endereco2.toString())


}

fun imprime(valor: Any) : Unit {
    println(valor)
}

fun imprime(valor:Int){
    println(valor)
}

fun imprime(valor: Double){
    println(valor)
}

fun imprime(endereco: Endereco){
    println(endereco)
}