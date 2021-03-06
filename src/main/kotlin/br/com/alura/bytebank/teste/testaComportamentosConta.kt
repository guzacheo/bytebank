import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaComportamentosConta() {
    println("Bem vindo ao ByteBank!!!")

    val alex = Cliente(nome="Alex", cpf="111.111.111-11",senha = 1000)
    val fran = Cliente(nome="Fran", cpf="222.222.222-22",senha = 2000)

    //guarda a referencia ao objeto conta e não o valor do objeto conta
    val contaAlex = ContaCorrente(titular = alex, 1001)
    contaAlex.deposita(200.0)
    val contaFran = ContaCorrente(titular = fran, 1002)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()

    contaFran.deposita(50.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    try {
        contaFran.transferencia(50.0, contaAlex, 200)
    } catch(e: SaldoInsuficienteException){
        e.printStackTrace()
    } catch(e: FalhaAutenticacaoException){
        println("Falha na autenticação")
        println("Falha na tranferência")
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro desconhecido")
        e.printStackTrace()
    }
    println()
    println(contaAlex.titular.nome)
    println(contaAlex.numero)
    println(contaAlex.saldo)
    println()

    println(contaFran.titular.nome)
    println(contaFran.numero)
    println(contaFran.saldo)


}