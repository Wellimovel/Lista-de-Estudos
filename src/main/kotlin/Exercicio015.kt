//#### Exercicio 015
//
//Faça um Programa que pergunte quanto você ganha por hora e o número de horas
//trabalhadas no mês.
//
//Calcule e mostre o total do seu salário no referido mês,
//sabendo-se que são descontados 11% para o Imposto de Renda,
//8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//    salário bruto.
//    quanto pagou ao INSS.
//    quanto pagou ao sindicato.
//    o salário líquido.
//calcule os descontos e o salário líquido, conforme a tabela abaixo:
//
//    + Salário Bruto : R$
//    - IR (11%) : R$
//    - INSS (8%) : R$
//    - Sindicato ( 5%) : R$
//    = Salário Liquido : R$
//
//Obs.: Salário Bruto - Descontos = Salário Líquido.

package org.example

fun main() {
    fun Exercicio015(salarioBruto: Double) {
        val ir: Double = salarioBruto*0.11
        val inss: Double = salarioBruto*0.08
        val sindicato: Double = salarioBruto*0.05
        val descontos:Double = ir+inss+sindicato
        val salarioLiquido:Double = salarioBruto-descontos
        println("+ Salário Bruto : R$$salarioBruto \n- IR (11%) : R$$ir \n- INSS (8%) : R$$inss \n- Sindicato ( 5%) : R$$sindicato \n= Salário Liquido : R\$$salarioLiquido" )
    }

    println("Informe seu salario bruto:")
    val salarioBruto:Double= readln().toDouble()
    val salarioLiquido=Exercicio015(salarioBruto)
    println("$salarioLiquido")
}
