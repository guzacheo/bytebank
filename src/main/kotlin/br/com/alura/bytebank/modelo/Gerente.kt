package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.FuncionarioAdm

open class Gerente(
    //Só precisa declarar (val/var) os atributos que nao existem em modelo.Funcionario
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
    // ):modelo.Funcionario faz a classe gerente ser filha(herdar) da classe modelo.Funcionario
) : br.com.alura.bytebank.modelo.FuncionarioAdm(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {
    override val bonificacao: Double get() = salario * 1.5
}