package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

abstract class ContaTransferivel(titular: Cliente, numero: Int) : br.com.alura.bytebank.modelo.Conta(titular = titular, numero = numero){

    fun transferencia(valor: Double, destino: br.com.alura.bytebank.modelo.Conta): Boolean {
        println("Transferindo $valor da conta $numero para a conta ${destino.numero}")

        if (saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}