//#### Exercicio 020
//
//Faça um Programa que peça um valor e mostre na tela se o valor é
//positivo ou negativo.
package org.example

fun main() {
    do{
        fun Exercicio020(numero: Int) {
            if (numero < 0) {
                println("negativo")
            } else {
                println("positivo")
            }
        }
        println("Insira um numero:")
        val numero: Int = readln().toInt()
        val chamada = Exercicio020(numero)
        println(chamada)
        println("Deseja continuar verificando numeros:(Y)or(N)")
        val resposta = readln()
    }while(resposta=="y")




}

//println("Vai fazer outra verificação?")
//val decisao = readln()

