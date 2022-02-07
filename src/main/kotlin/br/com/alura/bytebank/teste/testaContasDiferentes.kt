import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {

    val alex = Cliente(nome="Alex", cpf="111.111.111-11",senha = 1000, endereco = Endereco("Avenida Paulista"))
    val fran = Cliente(nome="Fran", cpf="222.222.222-22",senha = 2000, endereco = Endereco("Rua vergueiro"))

    val contaCorrente = br.com.alura.bytebank.modelo.ContaCorrente(alex, 1001)
    contaCorrente.deposita(1000.0)
    val contaPoupanca = br.com.alura.bytebank.modelo.ContaPoupanca(fran,1002)
    contaPoupanca.deposita(1000.0)
    println()

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.saque(100.0)
    contaCorrente.saque(100.0)

    println("Saldo corrente após saque: ${contaCorrente.saldo}")
    println("Saldo poupança após saque: ${contaPoupanca.saldo}")
    println()

    println("Saldo corrente: ${contaCorrente.saldo}")
    println("Saldo poupança: ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transferencia(100.0, contaCorrente)

    println("Saldo corrente após transferencia: ${contaCorrente.saldo}")
    println("Saldo poupança após transferencia: ${contaPoupanca.saldo}")
    println()

    println("Logradouro do Alex: ${alex.endereco.logradouro}")
    println("Logradouro da Fran: ${fran.endereco.logradouro}")
}
