package br.com.alura.bytebank.modelo

interface Autenticavel {

    fun autenticacao(senha: Int): Boolean
}