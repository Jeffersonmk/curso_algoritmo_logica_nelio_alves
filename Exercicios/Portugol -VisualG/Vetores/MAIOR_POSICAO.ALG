Algoritmo "maior_posicao"
//  
//  
// 
//  
// Descricao   : Problema "maior_posicao"
//Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior n�mero do vetor (supor n�o haver empates). Mostrar tamb�m a posi��o do maior elemento,
//considerando a primeira posi��o como 0 (zero).
//Exemplo:
//Quanto numeros voce vai digitar? 6
//Digite um numero: 8.0
//Digite um numero: 4.0
//Digite um numero: 10.0
//Digite um numero: 14.0
//Digite um numero: 13.0
//Digite um numero: 7.0
//MAIOR VALOR = 14.0
//POSICAO DO MAIOR VALOR = 3
// Autor(a)    : Jefferson
// Data atual  : 12/12/2023
Var
        i,N,posicaoMaior:inteiro
        maior:real
        
        numeros:vetor [0..99] de real
        
        

Inicio


        escreva("Quanto numeros voce vai digitar? ")
        leia(N)
        
        para i de 0 ate (N-1) faca
           escreva("Digite um numero: ")
           leia(numeros[i])
        fimpara
        
        maior<-numeros[0]
        posicaoMaior<-0
        
        para i de 1 ate (N-1) faca
             se numeros[i] > maior entao
                maior<-numeros[i]
                posicaoMaior<- i
             fimse
        fimpara
        
        escreval("MAIOR VALOR = ",maior:3:1)
        escreva("POSICAO DO MAIOR VALOR = ",posicaoMaior)
        

        
        
        
        


        
        
        


Fimalgoritmo