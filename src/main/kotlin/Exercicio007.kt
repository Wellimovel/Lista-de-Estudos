//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro
//desta área para o usuário.
package org.example

fun main() {
    fun Exercicio007(){
        println("Passe os lado do quadrado.")
        val lado:Int= readln().toInt()
        val calculo:Int=lado.times(lado)
        println(calculo)
        val areaDobro=calculo.times(2)
        println("O dobro do lado é $areaDobro")
    }
    val dobroDaArea:Unit = Exercicio007()
    println(dobroDaArea)
}