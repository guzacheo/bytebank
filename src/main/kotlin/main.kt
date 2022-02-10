package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun main() {

    // "?" para indicar que ele pode ser nulo, mesmo a não estando especificado na classe Endereco
    var endereco: Endereco? = Endereco(logradouro = "Rua Vergueiro", complemento = "Casa")
    // !! é uma forma de garantir que a variavel nao é nula, mas não é comum ser usado/Deve ser evitado - Gera erro
//    print(endereco!!.logradouro)
    //safe call (?) para verificar se o endereco é nulo ou não, se for nulo, imprime nulo
    println("Logradouro: ${endereco?.logradouro}")
    // let manda a variavel para uma função e permite um codigo mais enxuto (usa o "?" apenas uma vez)
    //se nao for renomeado para "endereco: Endereco", tem o nome de "it"
    endereco?.let{ endereco: Endereco ->
        println("Tamanho do Logradour: ${endereco.logradouro.length}")
        val tamanhoComplemento: Int =
            // ?: é um "if not null" simplificado, <se nao for nulo> ?: <se for nulo> - Elvis
            endereco.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println("Tamanho do complemento: $tamanhoComplemento")
    }

    println()
    teste(1)
    teste("")
}
//O "?" pode ser usado em castings para verificar se o casting foi convertido ou nao(null)
fun teste(valor: Any){
    val numero: Int? = valor as? Int
    println(numero)
}


 