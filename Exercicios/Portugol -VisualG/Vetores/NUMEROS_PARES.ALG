Algoritmo "numeros_pares"
// 
//  
// Descrição   : Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
//Exemplo:
//Quantos numeros voce vai digitar? 6
//Digite um numero: 8
//Digite um numero: 2
//Digite um numero: 11
//Digite um numero: 14
//Digite um numero: 13
//Digite um numero: 20
//NUMEROS PARES:
//8 2 14 20
//QUANTIDADE DE PARES = 4
// Autor(a)    : Jefferson
// Data atual  : 09/12/2023
Var


   cont,N,i:inteiro
   
   numeros:vetor [0..6] de inteiro

Inicio

      escreva("Quantos numeros voce vai digitar?")
      leia(N)
      
      para i de 0 ate (N-1) faca
           escreva("Digite um numero:")
           leia(numeros[i])
      fimpara
      
      escreval("NUMEROS PARES:")
      
      escreval
      
      para i de 0 ate (N-1) faca
           se numeros[i]% 2 = 0 entao
              escreva(numeros[i])
           fimse
      fimpara
      
      escreval
      
      cont<-0
      
      para i de 0 ate (N-1) faca
           se numeros[i]% 2 = 0 entao
              cont<-cont+1
           fimse
      fimpara

      escreval
      
      escreva("QUANTIDADE DE PARES = ",cont)
      
      escreval
      escreval
      
      
      


Fimalgoritmo