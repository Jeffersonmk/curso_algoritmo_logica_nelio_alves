Algoritmo "cada_linha"
//  
//  
// 
//  
// Descricao   : Problema "cada_linha"
//Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
//de cada linha. Suponha não haver empates.
//Exemplo:
//Qual a ordem da matriz? 4
//Elemento [0,0]: 5
//Elemento [0,1]: -3
//Elemento [0,2]: 10
//Elemento [0,3]: 8
//Elemento [1,0]: 15
//Elemento [1,1]: 8
//Elemento [1,2]: 2
//Elemento [1,3]: 10
//Elemento [2,0]: 7
//Elemento [2,1]: 9
//Elemento [2,2]: -4
//Elemento [2,3]: 3
//Elemento [3,0]: 8
//Elemento [3,1]: -7
//Elemento [3,2]: 4
//Elemento [3,3]: 13
//MAIOR ELEMENTO DE CADA LINHA:
//10
//15
//9
//13
// Autor(a)    : Jefferson
// Data atual  : 31/12/2023
Var

        N,i,j:inteiro
        mat:vetor [0..9,0..9] de real
        maior:real

Inicio

       escreva("Qual a ordem da matriz? ")
       leia(N)
       
       para i de 0 ate N-1 faca
            para j de 0 ate N-1 faca
               escreva("Elemento [",i,",",j,"]:")
               leia(mat[i,j])
            fimpara
       fimpara
       
       escreval("MAIOR ELEMENTO DE CADA LINHA:")
       
       para i de 0 ate N-1 faca
            maior<-mat[i,0]
            para j de 0 ate N-1 faca
                 se mat[i,j]>maior entao
                    maior<-mat[i,j]
                 fimse
            fimpara
            escreval(maior)
       fimpara
       


Fimalgoritmo