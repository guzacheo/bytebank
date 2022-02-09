package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException

//criar uma property global com set restrito para contar no numnero de contas criadas
//var totalContas: Int = 0
//    private set

abstract class Conta(val titular: Cliente, val numero: Int) : Autenticavel{
    var saldo = 0.0
        //protected da acesso ao set do saldo pelas classes filhas
        protected set

    //objeto criado para este uso, permite o uso de uma variavel ""global"" e a deixa privada para alteracao somente pela classe conta
    //o objeto é tratado como uma property e caso nao seja nomeado, possui o nome "Companio"
    companion object {
        var totalContas = 0
            private set
    }

//    constructor(titular: String, numero: Int){
//        this.titular = titular
//        this.numero = numero
//    }

    //para contar quantas contas foram criadas sempre quando um objeto tipo conta for inicializado
    init{
        totalContas++
    }

    override fun auth(senha: Int):Boolean{
        return titular.auth(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saque(valor: Double)

    fun transferencia(valor: Double, destino: br.com.alura.bytebank.modelo.Conta, senha: Int) {
        println("Transferindo $valor da conta $numero para a conta ${destino.numero}")

        if (saldo >= valor) {
            if (!auth(senha)){
                throw FalhaAutenticacaoException()
            } else {
                this.saldo -= valor
                destino.deposita(valor)
            }

        } else {
            throw SaldoInsuficienteException("\nSaldo: $saldo \nValor da tranferencia: $valor \nSaldo insuficiente para a transferencia")
        }
    }

}