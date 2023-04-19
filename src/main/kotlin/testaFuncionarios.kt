fun testaFuncionarios(){
    val alex: Funcionario = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 3500.00
    )

    printMsg("Nome: ${alex.nome}")
    printMsg("CPF: ${alex.cpf}")
    printMsg("Salario: ${alex.salario}")
    printMsg("Bonificação: ${alex.bonificacao()}")

    val fran: Gerente = Gerente(
        nome = "Fran",
        cpf =  "222.222.222-22",
        salario = 7000.00,
        senha = 1234
    )

    printMsg("Nome: ${fran.nome}")
    printMsg("CPF: ${fran.cpf}")
    printMsg("Salario: ${fran.salario}")
    printMsg("Bonificação: ${fran.bonificacao()}")
    fran.autenticacao(1234)

    val gui: Diretor = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 10000.00,
        senha = 1533,
        plr = 3000.00
    )

    printMsg("Nome: ${gui.nome}")
    printMsg("CPF: ${gui.cpf}")
    printMsg("Salário: ${gui.salario}")
    printMsg("Bonificação: ${gui.bonificacao()}")
    printMsg("PLR: ${gui.plr}")
    gui.autenticacao(1533)

    val maria: Funcionario = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 6500.00
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    printMsg("O total de bonificações é: ${calculadora.total}")
}