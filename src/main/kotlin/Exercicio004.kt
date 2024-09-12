//#### Exercicio 004
//
//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
package org.example


fun main(){
    fun Exercicio004() : Double{
        val notas = mutableListOf<Double>()
        for(i in 1..4){
            print("Digite a nota $i: ")
            val nota = readLine()?.toDoubleOrNull()?:continue
            notas.add(nota)
        }
        val soma = notas.sum()
        val media = soma / notas.size
        return media

    }
    val media = Exercicio004()
    println(" Media: $media")

}