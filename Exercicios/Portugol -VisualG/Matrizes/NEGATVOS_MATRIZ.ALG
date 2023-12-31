Algoritmo "negatvos_matriz"
//  
//  
// 
//  
// Descricao   : Problema "negativos_matriz"
//Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
//exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.
//Exemplo:
//Qual a quantidade de linhas da matriz? 2
//Qual a quantidade de colunas da matriz? 3
//Elemento [0,0]: 12
//Elemento [0,1]: -8
//Elemento [0,2]: 5
//Elemento [1,0]: -13
//Elemento [1,1]: 10
//Elemento [1,2]: -6
//VALORES NEGATIVOS:
//-8
//-13
//-6
// Autor(a)    : Jefferson
// Data atual  : 31/12/2023
Var

        i,j,M,N:inteiro
        mat:vetor [0..9,0..9] de inteiro


Inicio

      escreva("Qual a quantidade de linhas da matriz? ")
      leia(M)

      escreva("Qual a quantidade de colunas da matriz? ")
      leia(N)
      
      para i de 0 ate M-1 faca
           para j de 0 ate N-1 faca
                escreva("Elemento [",i,",",j,"]:")
                leia(mat[i,j])
           fimpara
      fimpara
      
      escreval("VALORES NEGATIVOS:")
      
      para i de 0 ate M-1 faca
           para j de 0 ate N-1 faca
                se (mat[i,j]) < 0 entao
                   escreval(mat[i,j])
                fimse
           fimpara
      fimpara
      

Fimalgoritmo