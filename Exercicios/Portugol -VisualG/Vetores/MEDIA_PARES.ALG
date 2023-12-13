Algoritmo "media_pares"
//  
//  
// 
//  
// Descricao   : Problema "media_pares "
//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
//Exemplo 1:
//Quantos elementos vai ter o vetor? 6
//Digite um numero: 8
//Digite um numero: 2
//Digite um numero: 11
//Digite um numero: 14
//Digite um numero: 13
//Digite um numero: 20
//MEDIA DOS PARES = 11.0
//Exemplo 2:
//Quantos elementos vai ter o vetor? 3
//Digite um numero: 7
//Digite um numero: 9
//Digite um numero: 11
//NENHUM NUMERO PAR
// Autor(a)    : Jefferson
// Data atual  : 13/12/2023
Var


        N,i,soma,cont:inteiro
        media:real
        vet:vetor [0..99] de inteiro



Inicio

        escreva("Quantos elementos vai ter o vetor?")
        leia(N)
        
        para i de 0 ate N-1 faca
             escreval("Digite um numero:")
             leia(vet[i])
        fimpara
        
        soma<-0
        cont<-0
        
        para i de 0 ate N-1 faca
             se vet[i]% 2 = 0 entao
                soma<-soma+vet[i]
                cont<-cont+1
             fimse
        fimpara
        
        se cont=0 entao
           escreva("NENHUM NUMERO PAR")
        senao
           media<-soma/cont
           escreva("MEDIA DOS PARES = ",media:3:1)
        fimse






Fimalgoritmo