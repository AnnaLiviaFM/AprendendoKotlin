//Tipos de Dados

/*strings: textos
* byte: números inteiros (necessário definir)
* int: números inteiros (Já reconhece automaticamente)
* long: números inteiros, com mais casas (Já reconhece automaticamente)
* float: números decimais (até 7 casas decimais)
* double: números decimais, com mais casas (até 15 casas decimais)
* boolean: valores Booleanos (estados) - true ou false
*/

fun main( ){
    var nome = "Livs"
    println(nome)

    //dar tipo à variável
    //var ou val - nome da variável - : tipo com 1a letra maiúscula
    val idade: Byte = 21
    println(idade)

    val numerolong = 9288777665345473
    println(numerolong)

    //val valor: Float = 2.567457907
    //error: the floating-point literal does not conform to the expected type Float
    val valor: Double = 2.567457907
    println(valor)//printa normalmente
}