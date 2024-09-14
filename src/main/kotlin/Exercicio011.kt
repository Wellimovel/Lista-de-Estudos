//#### Exercicio 011
//
//Faça um Programa que peça 2 números inteiros e um número real.
//Calcule e mostre:
//    o produto do dobro do primeiro com metade do segundo.
//    a soma do triplo do primeiro com o terceiro.
//    o terceiro elevado ao cubo.
package org.example
import kotlin.math.pow
fun main() {
    fun Exercicio011() {
        println("escreva um numero inteiro")
        val functUm:Int= readln().toInt()
        println("escreva um numero inteiro novamente")
        val functDois:Int= readln().toInt()
        println("escreva um numero real")
        val functTres:Double= readln().toDouble()
        val contaUm = functUm*2+(functDois/2)
        println("o produto do dobro do primeiro com metade do segundo é: $contaUm")
        val contaDois:Double = functUm * 3+functTres
        println("a soma do triplo do primeiro com o terceiro: $contaDois")
        val contaTres = functTres.pow(3)
        println("o terceiro elevado ao cubo: $contaTres")





    }
    val resultado= Exercicio011()
    println(resultado)
    }
