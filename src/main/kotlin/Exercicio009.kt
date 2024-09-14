//#### Exercicio 009
//
//Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre
//a temperatura em graus Celsius.
//C = (5 * (F-32) / 9).
package org.example

fun main() {
    fun Exercicio009() {
        println("Passe a temperatura em Farenheit:")
        val farenheit:Double= readln().toDouble()
        val ceusius: Double= 5*(farenheit-32)/9
        println("$ceusius")
    }
    val resultado= Exercicio009()
    println(resultado)
}