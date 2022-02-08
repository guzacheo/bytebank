package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.SistemaInterno
import testaContasDiferentes

private fun testaObjects() {
    println()
    testaContasDiferentes()

    println()
    println("Total de contas criadas: ${Conta.totalContas}")
    println()

    val fran = object : Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "222.222.222-22"
        val senha: Int = 1000

        override fun auth(senha: Int): Boolean = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(fran, 1000)
}