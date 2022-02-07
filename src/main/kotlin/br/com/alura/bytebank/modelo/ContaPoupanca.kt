package br.com.alura.bytebank.modelo

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : br.com.alura.bytebank.modelo.ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saque(valor: Double) {
        if (saldo >= valor) {
            this.saldo -= valor
        }
    }
}