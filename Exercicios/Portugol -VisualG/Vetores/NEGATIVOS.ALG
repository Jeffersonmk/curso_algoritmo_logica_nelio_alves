Algoritmo "negativos"
//  
//  
// 
//  
// Descricao   : Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
//Exemplo:
//Quantos numeros voce vai digitar? 6
//Digite um numero: 8
//Digite um numero: -2
//Digite um numero: 9
//Digite um numero: 10
//Digite um numero: -3
//Digite um numero: -7
//NUMEROS NEGATIVOS:
//-2
//-3
//-7
// Autor(a)    : Jefferson
// Data atual  : 07/12/2023
Var

       N,i :inteiro
       vet:vetor [0..10] de inteiro

Inicio

      escreva("Quantos numeros voce vai digitar?")
      leia(N)
      
      para i de 0 ate N-1 faca
           escreva("Digite um numero: ")
           leia(vet[i])
      fimpara
           
      escreval("NUMEROS NEGATIVOS:")
      
           para i de 0 ate N-1 faca
                se vet[i]<0 entao
                   escreval(vet[i])
                fimse
           fimpara

Fimalgoritmo