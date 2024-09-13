//#### Exercicio 005

//Faça um Programa que converta metros para centímetros.

package org.example

fun main() {
    fun Exercicio005(){
        var metros: Double = 0.0
        var centimetros:Double =0.0
        println("Digite os metros...")
        metros = readln().toDouble()
        centimetros = metros*100
        println(centimetros)
}
    val conversao = Exercicio005()
    println(" São: $conversao centimetros")
}
