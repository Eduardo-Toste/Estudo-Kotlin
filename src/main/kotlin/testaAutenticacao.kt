fun testaAutenticacao(){
    val gerente = Gerente(
        nome = "Alex",
        cpf = "122.222.133-65",
        salario = 4500.00,
        senha = 11111
    )

    val diretora = Diretor(
        nome = "Fran",
        cpf = "131.554.656-99",
        salario = 3750.00,
        senha = 13131,
        plr = 2100.00
    )

    val sistema = SistemaInterno()

    val cliente1 =  Cliente(
        nome = "Euclides",
        cpf = "763-321-542-00",
        senha = 1422
    )

    sistema.entra(gerente, 11111)
    sistema.entra(cliente1, 1422)
    sistema.entra(diretora, 13131)
}