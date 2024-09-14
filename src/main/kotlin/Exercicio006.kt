//#### Exercicio 006
//
//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
package org.example

import kotlin.math.PI
import kotlin.math.pow

fun main(){
    fun Exercicio006(): Double {
        var raio: Double =0.0
        println("Por gentileza preencha o tamanho do raio em cm")
        raio = readln().toDouble()
        var diametro:Double = raio.pow(2.0)
        var area:Double = diametro.times(3.14)
        var areaDoRaio:Double = area
        return areaDoRaio

    }
    val areaDoRaio :Double=Exercicio006()
    println("$areaDoRaio")

}