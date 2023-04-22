package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.print.printMsg

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
): Autenticavel {

    override fun autenticacao(senha: Int): Boolean{
        if (this.senha == senha){
            printMsg("Usuário de Cliente autenticado com sucesso!")
            return true
        }
        printMsg("Usuário não autenticado, tente novamente!")
        return false
    }
}