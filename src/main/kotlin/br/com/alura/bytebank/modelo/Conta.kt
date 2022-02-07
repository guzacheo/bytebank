package br.com.alura.bytebank.modelo

abstract class Conta(val titular: Cliente, val numero: Int) {
    var saldo = 0.0
        //protected da acesso ao set do saldo pelas classes filhas
        protected set

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saque(valor: Double)
}