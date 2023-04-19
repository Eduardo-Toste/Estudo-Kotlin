abstract class Conta(
    var titular: String,
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