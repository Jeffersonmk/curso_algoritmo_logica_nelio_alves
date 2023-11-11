Algoritmo "fatorial"
//  
//  
// 
//  
// Descricao   : Problema "fatorial" (adaptado de URI 1153)
//Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
//fatorial de N.
//Exemplo 1:
//Digite o valor de N: 4
//FATORIAL = 24
//Exemplo 2:
//Digite o valor de N: 0
//FATORIAL = 1
//Exemplo 3:
//Digite o valor de N: 6
//FATORIAL = 720
//Exemplo 4:
//Digite o valor de N: 1
//FATORIAL = 1
// Autor(a)    : Jefferson
// Data atual  : 11/11/2023
Var


        N,i,fatorial:inteiro

Inicio


      escreval("Digite o valor de N:")
      leia(N)
      
      se N=0 entao
         escreva("FATORIAL = 1")
      senao
         para i de N-1 ate 1 passo -1 faca
              N<-N*i
         fimpara
         
         escreva("FATORIAL = ",N)

      fimse
      

           

      
      


Fimalgoritmo