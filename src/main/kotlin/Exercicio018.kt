//#### Exercicio 018
//
//Faça um programa que peça o tamanho de um arquivo para download (em MB) e a
//velocidade de um link de Internet (em Mbps), calcule e informe o tempo
//aproximado de download do arquivo usando este link (em minutos).
package org.example

import java.sql.Time

fun main() {
    fun Exercicio018(tamanho:Int) {
        val velocidadeMbps=100
        val tempo = tamanho/velocidadeMbps
        val tempoMinutos =tempo/60
            println("Tempo estimado $tempoMinutos minutos")

    }
    println("Qual o tamanho do arquivo a ser baixado (em MB):")
    val tamanho:Int= readln().toInt()
    val tempoAproximado = Exercicio018(tamanho)
    println(tempoAproximado)

}
