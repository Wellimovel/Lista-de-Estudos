//#### Exercicio 010
//
//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre
//em graus Farenheit.
package org.example
fun main() {
    fun Exercicio010() {
        println("Passe a temperatura em Ceusius:")
        val ceusius:Double= readln().toDouble()
        val farenheit: Double= 1.8*ceusius+32
        println("$farenheit")
    }
    val resultado= Exercicio010()
    println(resultado)
    }
