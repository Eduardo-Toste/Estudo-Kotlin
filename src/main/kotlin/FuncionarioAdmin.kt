abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun autenticacao(senha: Int): Boolean{
        if (this.senha == senha){
            printMsg("Usuário Admin autenticado com sucesso!")
            return true
        }
        printMsg("Usuário não autenticado, tente novamente!")
        return false
    }
}