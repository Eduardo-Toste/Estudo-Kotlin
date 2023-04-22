package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        admin.autenticacao(senha)
    }
}