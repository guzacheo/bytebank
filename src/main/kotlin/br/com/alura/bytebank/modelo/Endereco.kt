package br.com.alura.bytebank.modelo

class Endereco (
    var logradouro: String = "",
    var número: Int = 0,
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = "",
    var complemento: String = ""


){
    override fun toString(): String {
        return """logradouro='$logradouro'
 número=$número
 bairro='$bairro'
 cidade='$cidade'
 estado='$estado'
 cep='$cep'
 complemento='$complemento')""".trimMargin()
    }

}