import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente("Alex", "111.111.111-11", 3000.0, 3000)
    val diretor = Diretor("Fran", "222.222.222-22", 5000.0, 5000, 7000.0)
    val cliente = Cliente("Gui", "333.333.333-33", Endereco(),1234)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 3000)
    println()
    sistema.entra(diretor, 5000)
    println()
    sistema.entra(cliente, 1234)
    println()

    val calculador = CalculadoraBonificacao()

    calculador.registra(gerente)
    calculador.registra(diretor)

    println(calculador.total)
}