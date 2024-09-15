//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
//o rendimento diário de seu trabalho.
//
//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
//regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa
//de R$ 4,00 por quilo excedente.
//
//João precisa que você faça um programa que leia a variável peso
//(peso de peixes) e calcule o excesso.
//
//Gravar na variável excesso a quantidade de quilos além do limite
//e na variável multa o valor da multa que João deverá pagar.
//Imprima os dados do programa com as mensagens adequadas.

package org.example

import org.jetbrains.kotlin.serialization.js.ast.JsAstProtoBuf.Return

fun main() {
    fun Exercicio014(pesoDePeixe:Int, multa:Int): Any {

        println("vai ter multa")

        if (pesoDePeixe > 50) {
            val divisaoPeixes: Int = (pesoDePeixe - 50)
            val conferencia:Int=  divisaoPeixes.times(multa)
            return conferencia
        } else {
           return println("Não precisa pagar multa hoje!")

        }
    }
        println("Boa tarde João Papo-de-Pescador, quantos kilos de peixe pegou hoje?")
        val multa: Int = 4
        val pesoDePeixe: Int = readln().toInt()
        val valorCalculado:Any = Exercicio014(pesoDePeixe, multa)
        println("O valor da sua multa é $valorCalculado")
    }
