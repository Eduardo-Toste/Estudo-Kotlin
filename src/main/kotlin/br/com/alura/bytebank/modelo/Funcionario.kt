package br.com.alura.bytebank.modelo

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {

    abstract fun bonificacao(): Double
}