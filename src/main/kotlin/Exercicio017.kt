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
    fun Exercicio016() {

        // Dados do problema
        val coberturaPorLitro = 6.0  // metros quadrados por litro
        val litroPorLata = 18.0
        val litroPorGalao = 3.6
        val precoLata = 80.0
        val precoGalao = 25.0

        // Solicita o tamanho da área a ser pintada
        print("Informe o tamanho da área em metros quadrados a ser pintada: ")
        val area = readLine()?.toDoubleOrNull() ?: return

        // Calcula a quantidade de tinta necessária com folga de 10%
        val litrosNecessarios = area / coberturaPorLitro * 1.10

        // Situação 1: Usar apenas latas de 18 litros
        val latasApenas = ceil(litrosNecessarios / litroPorLata)
        val custoLatasApenas = latasApenas * precoLata

        // Situação 2: Usar apenas galões de 3,6 litros
        val galoesApenas = ceil(litrosNecessarios / litroPorGalao)
        val custoGaloesApenas = galoesApenas * precoGalao

        // Situação 3: Misturar latas e galões para o menor custo
        val latasMisturado = litrosNecessarios.toInt() / litroPorLata.toInt()
        val restanteLitros = litrosNecessarios % litroPorLata
        val galoesMisturado = ceil(restanteLitros / litroPorGalao)
        val custoMisturado = (latasMisturado * precoLata) + (galoesMisturado * precoGalao)

        // Exibe os resultados
        println("Situação 1: Usar apenas latas de 18 litros:")
        println("Quantidade de latas: $latasApenas")
        println("Custo total: R$ $custoLatasApenas")

        println("\nSituação 2: Usar apenas galões de 3,6 litros:")
        println("Quantidade de galões: $galoesApenas")
        println("Custo total: R$ $custoGaloesApenas")

        println("\nSituação 3: Misturar latas e galões para o menor custo:")
        println("Quantidade de latas: $latasMisturado")
        println("Quantidade de galões: $galoesMisturado")
        println("Custo total: R$ $custoMisturado")


}
    val infoDeCompras =Exercicio016()
    println(infoDeCompras)

}
