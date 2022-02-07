package br.com.alura.bytebank.modelo

open class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : br.com.alura.bytebank.modelo.Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double get() = salario*0.1 + salario
}