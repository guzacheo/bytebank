fun testaLoops() {
    //    for (i in 1..5) {
//        //1..5 vai de 1 em 1 do 1 ao 5
//        //5 downTo 1 vai de 1 em 1 do 5 ao 1
//        //5 downTo 1 step 2 vai de 2 em 2 do 5 ao 1
//        val titular = "Alex $i"
//
//        //break pausa a execuçao quando chegar no i==4
//        if (i==4){break}
//
//        //pula o a execucao do i==3
//        if (i==3){continue}
//
//        // Variaveis imutaveis precisam ter uma atribuicao ao serem declaradas
//        // Atribuir valores na declaracao de variaveis e uma boa pratica de programacao
//        val numero = 1000 + i
//        var saldo = 100.0 + i
//
//        // precisa usa o ".0", para definir o tipo double na variável
//        // Variáveis não mudam de tipo no Kotlin
////        saldo = 100.0
////        saldo += 200
//
//        println("Titular: $titular")
//        println("Número da modelo.Conta: $numero")
//        println("Saldo: $saldo")
//        println()
//
//    }
    var i = 0
    while (i < 5) {
        //1..5 vai de 1 em 1 do 1 ao 5
        //5 downTo 1 vai de 1 em 1 do 5 ao 1
        //5 downTo 1 step 2 vai de 2 em 2 do 5 ao 1
        val titular = "Alex $i"
        // Variaveis imutaveis precisam ter uma atribuicao ao serem declaradas
        // Atribuir valores na declaracao de variaveis e uma boa pratica de programacao
        val numero = 1000 + i
        var saldo = 100.0 + i

        // precisa usa o ".0", para definir o tipo double na variável
        // Variáveis não mudam de tipo no Kotlin
//        saldo = 100.0
//        saldo += 200

        println("Titular: $titular")
        println("Número da modelo.Conta: $numero")
        println("Saldo: $saldo")
        println()
        i++
    }
}