fun main() {
    val contaSalario = ContaSalario("Eduardo", 1000)
    val contaDudu = ContaCorrente("Dudu", 1111)

    contaSalario.deposita(1000.00)
    contaSalario.transfere(100.00,contaDudu)

    printMsg("Saldo da Conta Corrente: ${contaDudu.saldo}")
    printMsg("Saldo da Conta Salario: ${contaSalario.saldo}")
}