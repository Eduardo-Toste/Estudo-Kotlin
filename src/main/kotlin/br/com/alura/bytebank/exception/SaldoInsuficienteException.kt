package br.com.alura.bytebank.exception

class SaldoInsuficienteException(mensagem: String = "O saldo e insuficiente!"): Exception(mensagem)