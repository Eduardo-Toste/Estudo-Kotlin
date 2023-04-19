fun testaLacos() {
    var i = 0
    while (i <= 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000
        var saldo: Double = 10.0

        println("O titular se chama: $titular")
        println("O número da conta é: $numeroConta")
        println("O saldo atual é: $saldo")
        i++
    }
}