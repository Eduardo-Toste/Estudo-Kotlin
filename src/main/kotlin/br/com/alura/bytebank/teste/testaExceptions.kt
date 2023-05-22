package br.com.alura.bytebank.teste

fun testaExceptions(){
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
}