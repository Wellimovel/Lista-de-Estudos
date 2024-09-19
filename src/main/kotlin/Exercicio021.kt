//#### Exercicio 021
//Faça um Programa que verifique se uma letra digitada é "F" ou "M".
//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
package org.example

fun main() {
    do {
        fun Exercicio021(parametro: String) {
            if (parametro == "F") {
                println("F - Feminino")
            } else if (parametro == "M") {
                println("M - Masculino")
            } else {
                println("Sexo Inválido")
            }

        }
        println("DIGITE F OU M:")
        val parametro: String = readln()
        println(Exercicio021(parametro))
        println("Deseja continuar? y ou n")
        val continuar:String = readln()

    }while (continuar=="y")
}
