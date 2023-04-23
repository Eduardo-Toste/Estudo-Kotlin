package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.print.printMsg

abstract class Conta(
    var titular: Cliente,
    val numero: Int
){
    var saldo = 0.0
        protected set

    fun deposita(valor: Double): Boolean {
        if (valor > 0) {
            this.saldo += valor
            printMsg("Valor depositado com sucesso!")
            return true
        }
        printMsg("Não é possível depositar este valor!")
        return false
    }

    abstract fun saca(valor: Double)

    abstract fun transfere(valor: Double, destino: Conta): Boolean
}