package br.com.alura.bytebank.modelo

interface Autenticavel {

    fun auth(senha: Int) : Boolean
}