package br.com.alura.bytebank.modelo

class ContaSalario(titular: Cliente, numero: Int) : br.com.alura.bytebank.modelo.Conta(titular = titular, numero = numero) {

    override fun saque(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }
}
