Algoritmo "soma_matrizes"
//  
//  
// 
//  
// Descricao   : Problema "soma_matrizes"
//Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
//cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
//dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.
//Exemplo:
//Quantas linhas vai ter cada matriz? 2
//Quantas colunas vai ter cada matriz? 3
//Digite os valores da matriz A:
//Elemento [0,0]: 3
//Elemento [0,1]: 5
//Elemento [0,2]: 2
//Elemento [1,0]: 4
//Elemento [1,1]: 5
//Elemento [1,2]: 1
//Digite os valores da matriz B:
//Elemento [0,0]: 2
//Elemento [0,1]: 4
//Elemento [0,2]: 5
//Elemento [1,0]: 1
//Elemento [1,1]: 8
//Elemento [1,2]: 8
//MATRIZ SOMA:
//5 9 7
//5 13 9
// Autor(a)    : Jefferson
// Data atual  : 2/1/2024
Var


        i,j,M,N:inteiro
        matA:vetor [0..9,0..9] de real
        matB:vetor [0..9,0..9] de real
        matC:vetor [0..9,0..9] de real
        


Inicio


        escreva("Quantas linhas vai ter cada matriz? ")
        leia(M)
        
        escreva("Quantas colunas vai ter cada matriz? ")
        leia(N)
        
        escreval("Digite os valores da matriz A: ")
        
        para i de 0 ate M-1 faca
             para j de 0 ate N-1 faca
                  escreva("Elemento [",i,",",j,"]:")
                  leia(matA[i,j])
             fimpara
        fimpara

        escreval("Digite os valores da matriz B: ")

        para i de 0 ate M-1 faca
             para j de 0 ate N-1 faca
                  escreva("Elemento [",i,",",j,"]:")
                  leia(matB[i,j])
             fimpara
        fimpara
        
        escreval("MATRIZ SOMA:")
        
        para i de 0 ate M-1 faca
             para j de 0 ate N-1 faca
                  matC[i,j]<-matA[i,j]+matB[i,j]
                  escreva(matC[i,j]," ")
             fimpara
        escreval
        fimpara

Fimalgoritmo