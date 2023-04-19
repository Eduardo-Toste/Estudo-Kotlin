class ContaPoupanca(
    titular: String,
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