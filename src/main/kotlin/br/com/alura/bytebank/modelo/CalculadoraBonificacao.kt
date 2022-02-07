package br.com.alura.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: br.com.alura.bytebank.modelo.Funcionario) {
        this.total += funcionario.bonificacao
    }

//    fun registra(funcionarioAdm: modelo.FuncionarioAdm) {
//        this.total += funcionarioAdm.bonificacao
//    }
//
//    fun registra(diretor: modelo.Diretor) {
//        this.total += diretor.bonificacao
//    }
}