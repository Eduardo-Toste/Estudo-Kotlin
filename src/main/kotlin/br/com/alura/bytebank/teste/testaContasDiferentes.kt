package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSalario
import br.com.alura.bytebank.print.printMsg

fun testaContasDiferentes() {

    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Murilo", cpf = "", senha = 99),
        3100
    )

    val contaPoupanca = ContaPoupanca(
        Cliente(nome = "Eduardo", cpf = "", senha = 54),
        3099
    )

    val contaSalario = ContaSalario(
        Cliente(nome = "Ageu", cpf = "", senha = 10),
        10001
    )

    contaCorrente.deposita(1000.00)
    contaPoupanca.deposita(1000.00)
    contaSalario.deposita(1500.00)
//    printMsg("Saldo da modelo.Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da modelo.Conta Poupança: ${contaPoupanca.saldo}")
//
//    contaCorrente.saca(100.00)
//    contaPoupanca.saca(100.00)
//    printMsg("Saldo da modelo.Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da modelo.Conta Poupança: ${contaPoupanca.saldo}")
//
//    contaCorrente.transfere(100.00, contaPoupanca)
//    printMsg("Saldo da modelo.Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da modelo.Conta Poupança: ${contaPoupanca.saldo}")
//
//    contaPoupanca.transfere(500.00, contaCorrente)
//    printMsg("Saldo da modelo.Conta Corrente: ${contaCorrente.saldo}")
//    printMsg("Saldo da modelo.Conta Poupança: ${contaPoupanca.saldo}")

    contaSalario.transfere(500.00, contaCorrente)
    printMsg("Saldo da conta Corrente: ${contaCorrente.saldo}")
    printMsg("Saldo da conta Poupança: ${contaSalario.saldo}")
}