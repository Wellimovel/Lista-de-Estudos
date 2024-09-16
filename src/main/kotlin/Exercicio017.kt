//#### Exercicio 017
//
//Faça um Programa para uma loja de tintas.
//
//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
//
//Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
//e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00
//ou em galões de 3,6 litros, que custam R$ 25,00.
//
//Informe ao usuário as quantidades de tinta a serem compradas
//e os respectivos preços em 3 situações:
//
//    comprar apenas latas de 18 litros;
//    comprar apenas galões de 3,6 litros;
//    misturar latas e galões, de forma que o preço seja o menor.
//        Acrescente 10% de folga e sempre arredonde os valores para cima,
//        isto é, considere latas cheias.
package org.example
import kotlin.math.ceil


fun main() {
    fun Exercicio016(area: Int) {
        val lataGrandeLitros:Double =18.00
        val lataGrandePreco:Double =80.00
        val lataPequenaLitros:Double =3.60
        val lataPequenaPreco:Double =25.00
    println("Selecione uma opção:")
        println("Digite o numero da opção:\n 1 - Latas de 18 litros;\n 2 - Galões de 3,6 litros;\n 3 - Latas e galões")
        val escolha:Int= readln().toInt()
        if(escolha == 1){
            val contaLatas:Int = ceil(area / 54.0).toInt()
            val latasTinta:Int = 80*contaLatas
            val latasReais: Int =latasTinta

            val conta= println("Você precisa comprar $contaLatas no valor de R$$latasReais")
            return conta

        }else if(escolha == 2){
            val contaLatas:Double = ceil((area / 21).toDouble(),6).toDouble()
            val latasTinta:Double = 80*contaLatas
            val latasReais: Double =latasTinta

            val conta= println("Você precisa comprar $contaLatas no valor de R$$latasReais")
            return conta

        }else if(escolha == 3){

        }else{
            println("Escolha inválida, reinicie o programa e escolha uma das 3 opções validas (1,2 ou 3)")
        }
    }
    println("Quantos metros quadrados a ser pintado?")
    val area: Int = readln().toInt()
    val infoDeCompras =Exercicio016(area)
    println(infoDeCompras)


}
