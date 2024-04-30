//Variáveis mutáveis e imutáveis
/* Obs.: em Kotlin, não precisamos do ;
* Podemos imprimir na tela com print() e println
*
*/


fun main( ){
    //Mutável: usamos var para variáveis mutáveis, ou seja, que podem ser modificadas
    var nome = "Anna Livia Freire"
    println(nome)
    nome = "Anna Livia FM"
    println(nome)

    //Imutável: Não conseguimos alterar o valor dela após sua criação. Utilizamos val 
    val idade = 21
    println(idade)
    //idade = 25
    //println(idade)
    //Retorna error: val cannot be reassigned

}