Algoritmo "dados_pessoas"
// 
//  
// Descricao   : Problema "dados_pessoas"
//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.
//Exemplo:
//Quantas pessoas serao digitadas? 5
//Altura da 1a pessoa: 1.70
//Genero da 1a pessoa: F
//Altura da 2a pessoa: 1.83
//Genero da 2a pessoa: M
//Altura da 3a pessoa: 1.54
//Genero da 3a pessoa: M
//Altura da 4a pessoa: 1.61
//Genero da 4a pessoa: F
//Altura da 5a pessoa: 1.75
//Genero da 5a pessoa: F
//Menor altura = 1.54
//Maior altura = 1.83
//Media das alturas das mulheres = 1.69
//Numero de homens = 2
// Autor(a)    : Jefferson
// Data atual  : 14/12/2023
Var

        altura: vetor [0..99] de real
        genero: vetor [0..99] de caractere
        N,i,ContHomens,contMulheres:inteiro
        media,alturaMaior,alturaMenor,soma:Real
        


Inicio


        escreva("Quantas pessoas serao digitadas?")
        leia(N)
        
        para i de 0 ate N-1 faca
             escreva("Altura da",i+1,"a pessoa:")
             leia(altura[i])
             escreva("Genero da",i+1,"a pessoa:")
             leia(genero[i])
        fimpara
             
        alturaMenor<-altura[0]
        alturaMaior<-altura[0]
        
        para i de 1 ate N-1 faca
             se altura[i]< alturaMenor entao
                alturaMenor<-altura[i]
             senao
                  se altura[i]>alturaMaior entao
                     alturaMaior<-altura[i]
                  fimse
             fimse
        fimpara
        
        soma<-0
        contMulheres<-0

        para i de 0 ate N-1 faca
             se genero[i] = "F" entao
                soma<-soma+altura[i]
                contMulheres<-contMulheres+1
             fimse
        fimpara
        
        media<-soma/contMulheres
        
        contHomens<-0
        
        para i de 0 ate N-1 faca
             se genero[i] = "M" entao
                contHomens<-ContHomens+1
             fimse
        fimpara
             
        escreval("Menor altura = ",alturaMenor)
        escreval("Maior altura = ",alturaMaior)
        escreval("Media das alturas das mulheres = ",media:3:2)
        escreval("Numero de homens = ",contHomens)
        




Fimalgoritmo