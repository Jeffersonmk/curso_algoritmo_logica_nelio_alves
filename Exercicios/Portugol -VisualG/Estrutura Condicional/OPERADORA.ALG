Algoritmo "operadora"
// 
//  
// Descrição   : Problema "operadora"
//Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
//telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
//ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
//Exemplo 1:
//Digite a quantidade de minutos: 22
//Valor a pagar: R$ 50.00
//Exemplo 2:
//Digite a quantidade de minutos: 103
//Valor a pagar: R$ 56.00
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 17/10/2023
Var

        ValorPago:real
        
        minutos:inteiro

   


Inicio

        escreva("Digite a quantidade de minutos: ")
        leia(minutos)
        

        ValorPago <-50
        
        se minutos>100 entao
        
           ValorPago <-ValorPago + 2 *(minutos-100)
           
        fimse
        
        escreva("Valor a pagar: ",ValorPago:4:2)
        
        



Fimalgoritmo




