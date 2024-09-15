//#### Exercicio 013
//
//Tendo como dado de entrada a altura (altura) de uma pessoa,
//construa um algoritmo que calcule seu peso ideal,
//utilizando as seguintes fórmulas:
//    Para homens: (72.7*altura) - 58
//    Para mulheres: (62.1*altura) - 44.7
package org.example

fun main() {
    fun pesoIdealHomen(altura: Double): Double {
        return (72.7*altura) - 58
    }
    fun pesoIdealMulher(altura: Double): Double {
        return (62.1*altura) - 44.7
    }
        println("Passe sua altura:")
        val altura = readln().toDouble()

        println("Digite (m) caso seja pessoa masculina ou (f) caso seja pessoa feminina:")
        val gen = readln()

    if (gen == "m"){
        val pesoIdeal:Double = pesoIdealHomen(altura)
        println("Seu peso ideal é de $pesoIdeal")

    }else if(gen == "f"){
        val pesoIdeal:Double = pesoIdealMulher(altura)
        println("Seu peso ideal é de $pesoIdeal")
    }else {
        println("Erro digite seu peso e o genero para realizar o calculo:")
    }



    }
