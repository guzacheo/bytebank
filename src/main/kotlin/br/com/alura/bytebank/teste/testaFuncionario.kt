import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionario() {
    val alex = br.com.alura.bytebank.modelo.Analista(
        "Alex",
        "111.111.111-11",
        1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")
    println()
    val fran = br.com.alura.bytebank.modelo.Gerente(
        "Fran",
        "222.222.222-22",
        2000.0,
        1234
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao}")
    if (fran.auth(1234)) {
        println("Autenticação concluída com sucesso")
    } else {
        println("Autenticação Falhou")
    }
    println()

    val gui = br.com.alura.bytebank.modelo.Diretor("Gui", "333.333.333-33", 4000.0, 2345, 6000.0)
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao}")
    if (gui.auth(2345)) {
        println("Autenticação concluída com sucesso")
    } else {
        println("Autenticação Falhou")
    }
    println()

    val maria = br.com.alura.bytebank.modelo.Analista("Maria", "444.444.444-44", 1500.0)
    val calculador = br.com.alura.bytebank.modelo.CalculadoraBonificacao()
    calculador.registra(alex)
    calculador.registra(fran)
    calculador.registra(gui)
    calculador.registra(maria)

    println("Total de Beneficios: ${calculador.total}")
}