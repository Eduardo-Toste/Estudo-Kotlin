package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.print.printMsg

fun funcao1(){
    println("início funcao1")
    try{
        funcao2()
    } catch (e: SaldoInsuficienteException){
        printMsg("SaldoInsuficienteException foi captada!")
        e.printStackTrace()
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}