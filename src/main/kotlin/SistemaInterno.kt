class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        admin.autenticacao(senha)
    }
}