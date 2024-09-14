//#### Exercicio 008
//
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
package org.example

fun main() {
    fun Exercicio008() {
        println("Quanto coê ganha por hora?")
        val salarioHora:Double = readln().toDouble()
        println("Quantas horas trabalhou no ultimo mês?")
        val horasTrabalhadas: Double = readln().toDouble()
        val salarioMes:Double = salarioHora.times(horasTrabalhadas)
        println("Seu salario este mês será de $salarioMes")
    }
    val resultado = Exercicio008()
    println(resultado)
}