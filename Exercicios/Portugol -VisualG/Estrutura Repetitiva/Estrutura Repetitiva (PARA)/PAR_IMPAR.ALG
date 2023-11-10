Algoritmo "par_impar"
//  
//  
// 
//  
// Descrição   : Problema "par_impar" (adaptado de URI 1074)
//Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
//Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
//se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
//apenas NULO.
//Exemplo:
//Quantos numeros voce vai digitar? 4
//Digite um numero: -5
//IMPAR NEGATIVO
//Digite um numero: 0
//NULO
//Digite um numero: 3
//IMPAR POSITIVO
//Digite um numero: -4
//PAR NEGATIVO
// Autor(a)    : Jefferson
// Data atual  : 10/11/2023
Var

     x,numero,i:inteiro



Inicio

      escreva("Quantos numeros voce vai digitar? ")
      leia(x)
      
      para i de 1 ate x faca

          escreva("Digite um numero:")
          leia(numero)
          
             se numero<0 entao
                se numero % 2 = 0   entao
                   escreval("PAR NEGATIVO")
                senao
                   escreval("IMPAR NEGATIVO")
                fimse
             fimse
             
             se numero>0 entao
                se numero % 2 = 0  entao
                   escreval("PAR POSITIVO")
                senao
                   escreval("IMPAR POSITIVO")
                   
                fimse
             fimse
             
             se numero=0 entao
                escreval("NULO")
             fimse
             
       fimpara
      
      


Fimalgoritmo