Algoritmo "soma_vetores"
//  
//  
// 
//  
// Descricao   : Problema "soma_vetores"
//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
//Quantos valores vai ter cada vetor? 6
//Digite os valores do vetor A:
//8
//2
//11
//14
//13
//20
//Digite os valores do vetor B:
//5
//10
//3
//1
//10
//7
//VETOR RESULTANTE:
//13
//12
//14
//15
//23
//27
// Autor(a)    : Jefferson
// Data atual  : 12/12/2023
Var

        i,N:inteiro
        A: vetor [0..10] de inteiro
        B: vetor [0..10] de inteiro
        C: vetor [0..10] de inteiro


Inicio


        escreva("Quantos valores vai ter cada vetor?")
        leia(N)
        
        escreval("Digite os valores do vetor A:")
        para i de 0 ate N-1 faca
             leia(A[i])
        fimpara
        
        escreval("Digite os valores do vetor B:")
        para i de 0 ate N-1 faca
             leia(B[i])
        fimpara
        
        escreval("VETOR RESULTANTE:")
        para i de 0 ate N-1 faca
             C[i]<-A[i]+B[i]
             escreval(C[i])
        fimpara


Fimalgoritmo