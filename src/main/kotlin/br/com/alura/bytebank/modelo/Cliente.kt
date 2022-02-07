package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val endereco: Endereco = Endereco(),
    val senha: Int
) : Autenticavel {

    override fun auth(senha: Int): Boolean {
        return this.senha == senha
    }
}