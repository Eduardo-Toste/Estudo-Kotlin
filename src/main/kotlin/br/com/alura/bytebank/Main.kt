package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.print.printMsg
import java.lang.ClassCastException
import java.lang.NumberFormatException


fun main() {
    println("início main")

    val entrada: String = "1.6"

    val valorRecebido: Double? = try{
        entrada.toDouble()
    } catch (e: NumberFormatException){
        println("Problema na conversao!")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if(valorRecebido != null){
        valorRecebido + 0.1
    } else {
        null
    }

    if(valorComTaxa != null){
        println("Valor recebido: $valorComTaxa")
    } else {
        println("Valor invalido!")
    }

    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    try{
        funcao2()
    } catch (e: ClassCastException){
        printMsg("ClassCastException foi captada!")
        e.printStackTrace()
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
        val endereco = Any()
        endereco as Endereco
    }
    println("fim funcao2")
}