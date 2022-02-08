import br.com.alura.bytebank.modelo.Endereco

fun main(args: Array<String>) {

    val endereco = Endereco("Rua vergueiro",238,"Vila Mariana", "São Paulo", "São Paulo")
    val enderecoNovo = Endereco("Avenida Domingo de Morais",1036,"Vila Mariana", "São Paulo", "São Paulo")

    println(endereco.equals(enderecoNovo))
    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println("Endereço: \n $endereco")
    println()
    println("Endereço Novo: \n $enderecoNovo")
}










