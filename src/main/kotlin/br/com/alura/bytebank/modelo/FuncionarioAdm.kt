package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdm(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
) : br.com.alura.bytebank.modelo.Funcionario(nome = nome, cpf = cpf, salario = salario),
    br.com.alura.bytebank.modelo.Autenticavel {

    override fun auth(senha: Int): Boolean {
        return this.senha == senha
    }
}
