Algoritmo "divisao"
//  
//  
// 
//  
// Descricao   : Problema "divisao" (adaptado de URI 1116)
//Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
//segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
//Exemplo:
//Quantos casos voce vai digitar? 3
//Entre com o numerador: 3
//Entre com o denominador: -2
//DIVISAO = -1.50
//Entre com o numerador: -8
//Entre com o denominador: 0
//DIVISAO IMPOSSIVEL
//Entre com o numerador: 0
//Entre com o denominador: 8
//DIVISAO = 0.00
// Autor(a)    : Jefferson
// Data atual  : 11/10/2023
Var

        numerador,denominador,divisao:real
        casos,i,x:inteiro
        
        

Inicio


        escreva("Quantos casos voce vai digitar?")
        leia(x)
        
        para i de 1 ate x faca
        
             escreva("Entre com o numerador:")
             leia(numerador)
             
             escreva("Entre com o denominador:")
             leia(denominador)

             se denominador=0 entao
                escreval("DIVISAO IMPOSSIVEL")
             senao
                divisao<-numerador/denominador
                escreval("DIVISAO = ",divisao:4:2)
             fimse

        fimpara
        

Fimalgoritmo