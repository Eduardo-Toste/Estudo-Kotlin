package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.print.printMsg

abstract class Conta(
    var titular: Cliente,
    val numero: Int
): Autenticavel {
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

    override fun autenticacao(senha: Int): Boolean {
        return titular.autenticacao(senha)
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

    fun transfere(valor: Double, destino: Conta, senha: Int){
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                "O saldo e insuficiente, saldo atual de: $saldo, valor a ser transferido: $valor"
            )
        }

        if (!autenticacao(senha)){
            throw FalhaAutenticacaoException()
        }

        this.saldo -= valor
        destino.deposita(valor)
        }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){


    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
){


    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
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

    fun transfere(){
        printMsg("Nao e possivel realizar transferencias em contas salarios!")
    }
}