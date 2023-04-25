package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.print.printMsg

abstract class Conta(
    var titular: Cliente,
    val numero: Int
){
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        printMsg("Criando conta...")
        total++
    }

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

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){


    override fun saca(valor: Double){
        val valorComTaxa = valor + 0.1
        if(this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            printMsg("Transferência realizada com sucesso!")
            return true
        }
        printMsg("Transferência incompleta, consulte seu saldo!")
        return false
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){


    override fun saca(valor: Double){
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            printMsg("Transferência realizada com sucesso!")
            return true
        }
        printMsg("Transferência incompleta, consulte seu saldo!")
        return false
    }
}

class ContaSalario(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {


    override fun saca(valor: Double){
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }

    override fun transfere(valor: Double, destino: Conta): Boolean {
        printMsg("Não é possível transferir de uma conta salário!")
        return true
    }
}