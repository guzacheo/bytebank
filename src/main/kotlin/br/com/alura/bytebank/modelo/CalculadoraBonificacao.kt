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

//SMARTCAST

//class CalculadoraBonificacao {
//
//    var total: Double = 0.0
//        private set
//
        // Usa o smart cast para tratar a variavel recebida como um tipo Funcionario, apesar da funcao aceitar qualquer tipo de variavel (Any)
//    fun registra(funcionario: Any) {
//        funcionario as Funcionario
//        this.total += funcionario.bonificacao
//    }
        // Confere se o valor recebido pela funcao é do tipo funcionario, pois a funcao só trabalha com o tipo funcionario, apesar de receber qualquer tipo de variavel (Any)
//    fun registra(funcionario: Any) {
//        if(funcionario is Funcionario){
//            this.total += funcionario.bonificacao
//        }
//    }
//
//}