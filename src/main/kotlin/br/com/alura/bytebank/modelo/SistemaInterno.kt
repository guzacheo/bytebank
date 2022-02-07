package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno{

    fun entra(funcionarioAdm: br.com.alura.bytebank.modelo.Autenticavel, senha: Int){
        if (funcionarioAdm.auth(senha)){
            println("Bem vindo ao ByteBank!!!")
        } else {
            println("Falha na autenticação...")
        }
    }
}