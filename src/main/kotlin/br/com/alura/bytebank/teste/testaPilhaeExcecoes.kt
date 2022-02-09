package br.com.alura.bytebank.br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.SaldoInsuficienteException

fun testaPilhaeExecoes(){
    println("início main")

    testaExpressao()

    funcao1()
    println("fim main")

}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        //        val endereco = Any()
        //        // usar o try e escolher a excecao especifica no cast, ajuda a identificar o problema e permite que o codigo continue rodando apesar da excecao
        //        // se colocar o "for" inteiro dentro do try, o programa para o loop e segue para a proxima linha
        //        try{endereco as Endereco}
        //        catch (e: ClassCastException){
        //            // Imprime a mensagem da excecao(e.message), o rastro da pilha(e.stackTrace) e a causa (e.cause) (se houver)
        //            e.printStackTrace()
        //            println("Pego na ClassCastException")
        //        }
        // Lança uma excecao
        throw SaldoInsuficienteException() // ou ArithmeticsException ou NumberFormatException
    }
    println("fim funcao2")
}