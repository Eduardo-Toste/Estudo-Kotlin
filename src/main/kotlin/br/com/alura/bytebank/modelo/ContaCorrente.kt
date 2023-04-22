package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.print.printMsg

class ContaCorrente(
    titular: String,
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