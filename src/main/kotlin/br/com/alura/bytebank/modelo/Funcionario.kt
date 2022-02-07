package br.com.alura.bytebank.modelo

// open faz com que essa classe possa ser herdada
// classes abstratas nao podem ser instanciadas, só podem ser utilizadas atraves de suas classes filhas.
//todas as classes abstratas ja sao abertas, nao precisam do "open" antes de "class"
abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
) {
    // equivalente a fazer uma funcao bonificacao que retorna 10% do salario
    abstract val bonificacao: Double
}
