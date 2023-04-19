fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        "Murilo",
        3100
    )

    val contaPoupanca = ContaPoupanca(
        "Eduardo",
        3099
    )

    val contaSalario = ContaSalario(
        "Ageu",
        10001
    )

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)
    contaSalario.deposita(1500.00)
//    printMsg("Saldo da Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da Conta Poupança: ${contaPoupanca.saldo}")
//
//    contaCorrente.saca(100.00)
//    contaPoupanca.saca(100.00)
//    printMsg("Saldo da Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da Conta Poupança: ${contaPoupanca.saldo}")
//
//    contaCorrente.transfere(100.00, contaPoupanca)
//    printMsg("Saldo da Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da Conta Poupança: ${contaPoupanca.saldo}")
//
//    contaPoupanca.transfere(500.00, contaCorrente)
//    printMsg("Saldo da Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da Conta Poupança: ${contaPoupanca.saldo}")

    contaSalario.transfere(500.00, contaCorrente)
    printMsg("Saldo da Conta Corrente: ${contaCorrente.saldo}")
    printMsg("Saldo da Conta Poupança: ${contaSalario.saldo}")
}