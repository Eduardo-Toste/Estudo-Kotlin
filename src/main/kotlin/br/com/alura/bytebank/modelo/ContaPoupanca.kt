package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.print.printMsg

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