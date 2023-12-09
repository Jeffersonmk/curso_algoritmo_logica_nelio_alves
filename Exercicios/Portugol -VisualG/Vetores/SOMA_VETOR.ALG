Algoritmo "soma_vetor"
//  
//  
// 
//  
// Descrição   : Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
// - Imprimir todos os elementos do vetor
// - Mostrar na tela a soma e a média dos elementos do vetor
//Exemplo:
//Quantos numeros voce vai digitar? 4
//Digite um numero: 8.0
//Digite um numero: 4.0
//Digite um numero: 10.0
//Digite um numero: 14.0
//VALORES = 8.0
//SOMA = 36.00
//MEDIA = 9.00
//4.0
//10.0
//14.0
// Autor(a)    : Jefferson
// Data atual  : 07/12/2023
Var



        N,i:inteiro
        vet: vetor [0..6] de real
        soma,media:real
        
        


Inicio

        escreva("Quantos numeros voce vai digitar?")
        leia(N)
        
        para i de 0 ate N-1 faca
             escreva("Digite um numero: ")
             leia(vet[i])
        fimpara
        
        escreval
        
        para i de 0 ate N-1 faca
             escreva(vet[i]:3:1," ")
        fimpara
        
        soma<-0
        
        para i de 0 ate N-1 faca
             soma<-soma+vet[i]
        fimpara
        
        escreval
        escreval("SOMA = ",soma:4:2)
        
        media<-soma/N

        escreval("MEDIA = ",media:4:2)
        
        


Fimalgoritmo