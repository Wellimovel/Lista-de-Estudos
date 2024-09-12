//#### Exercicio 003
//
//Faça um Programa que peça dois números e imprima a soma.
package org.example

    fun ExercicioTres(){
        println("Digite o Primeiro numero...")
        val primeiroNumero:Int = readLine()!!.toInt()
        println("Digite o Segundo numero...")
        val segundoNumero:Int = readLine()!!.toInt()

        val soma:Int? = primeiroNumero+segundoNumero
        println(soma)

    }
