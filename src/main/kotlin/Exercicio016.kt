//#### Exercicio 016
//
//Faça um programa para uma loja de tintas.
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros
//quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
//
//Informe ao usuário a quantidades de latas de tinta
//a serem compradas e o preço total.
package org.example
import kotlin.math.ceil
import kotlin.time.times

fun main() {
    fun Exercicio016(area: Int) {
        val contaLatas:Int = ceil(area / 54.0).toInt()
        val latasTinta:Int = 80*contaLatas
        val latasReais: Int =latasTinta

        val conta= println("Você precisa comprar $contaLatas no valor de R$$latasReais")
        return conta
    }
    println("Quantos metros quadrados a ser pintado?")
    val area: Int = readln().toInt()
    val latasComprar =Exercicio016(area)
    println(latasComprar)


}
