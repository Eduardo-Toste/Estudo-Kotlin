class ContaSalario(
    titular: String,
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