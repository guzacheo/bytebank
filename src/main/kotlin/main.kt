package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.ClassCastException
import java.lang.NumberFormatException

fun main() {
    println("início main")

    val entrada = "45.65"

    val valorRecebido :Double? = try{
        entrada.toDouble()
    } catch (e: NumberFormatException){
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null){
        valorRecebido + 0.1
    } else {
        null
    }

    if (valorComTaxa != null){
        println("Valor recebido: $valorComTaxa")
    } else{
        println("Valor Inválido")
    }


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
    for (i in 1..5){
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
    }
    println("fim funcao2")
} 