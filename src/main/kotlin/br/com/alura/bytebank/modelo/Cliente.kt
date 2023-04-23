package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.print.printMsg

class Cliente(
    var nome: String,
    val cpf: String,
    var endereco: Endereco = Endereco(),
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