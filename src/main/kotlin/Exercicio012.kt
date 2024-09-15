//#### Exercicio 012
//
//Tendo como dados de entrada a altura de uma pessoa,
//construa um algoritmo que calcule seu peso ideal,
//usando a seguinte fórmula: (72.7*altura) - 58
package org.example

fun main() {
    fun Exercicio012(altura:Float): Double {
        return (72.7*altura) - 58
    }
    println("Digite sua altura em cm:")
    val altura:Float = readln().toFloat()
    val exercicio: Double = Exercicio012(altura)
    println(exercicio)
    }
