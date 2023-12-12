Algoritmo "multiplos"
//  
//  
// 
//  
// Descricao   : Problema "multiplos" (adaptado de URI 1044)
//Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
//números podem ser digitados em qualquer ordem.
//Exemplo 1:
//Digite dois numeros inteiros:
//6
//24
//Sao multiplos
//Exemplo 2:
//Digite dois numeros inteiros:
//24
//6
//Sao multiplosExemplo 3:
//Digite dois numeros inteiros:
//13
//5
//Nao sao multiplos
// Autor(a)    : Jefferson
// Data atual  : 23/10/2023
Var

        x,y:inteiro

Inicio

      escreval("Digite dois numeros inteiros: ")
      leia(x)
      leia(y)
      
      se (x%y=0) ou (y%x=0) entao
      
      escreva("Sao Multiplos")
      
      senao
      
      escreva("Nao sao multiplos")
      
      fimse


Fimalgoritmo