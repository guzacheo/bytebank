fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("modelo.Conta Positiva")
    } else if (saldo == 0.0) {
        println("modelo.Conta Neutra")
    } else {
        println("modelo.Conta Negativa")
    }

    //when permite que tudo seja escrito em uma linha, pode facilitar em condicoes mais simples
    when {
        saldo > 0.0 -> println("modelo.Conta Positiva")
        saldo == 0.0 -> println("modelo.Conta Neutra")
        else -> println("modelo.Conta Negativa")
    }

}