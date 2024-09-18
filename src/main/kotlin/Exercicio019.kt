//#### Exercicio 019
//
//Faça um Programa que peça dois números e imprima o maior deles.
package org.example

fun main() {
    fun Exercicio019(a:Int,b:Int):Int {
        if (a>b){
            return a
        }else{
            return b
        }
    }
    println("Digite um numero")
    val a : Int = readln().toInt()
    println("Digite outro numero")
    val b : Int = readln().toInt()
    val escolha:Int = Exercicio019(a, b)
    println(escolha)

}
