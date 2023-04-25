package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.print.printMsg

fun testaObjects(){

    val fran = object {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        fun autentica(senha: Int) = this.senha == senha
    }

    printMsg("Nome do cliente: ${fran.nome}")
    printMsg("CPF do cliente: ${fran.cpf}")

    val alex = Cliente(nome = "Alex", cpf = "123.321.231-31", senha = 1)
    val julia = Cliente(nome = "Julia", cpf = "123.321.231-31", senha = 2)
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = julia, numero = 1001)

    printMsg("Este é o total de contas: ${Conta.total}")
}