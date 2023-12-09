Algoritmo "alturas"
//  
//  
// 
//  
// Descrição   : Problema "alturas"
//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
//Exemplo:
//Quantas pessoas serao digitadas? 5
//Dados da 1a pessoa:
//Nome: Joao
//Idade: 15
//Altura: 1.82
//Dados da 2a pessoa:
//Nome: Maria
//Idade: 16
//Altura: 1.60
//Dados da 3a pessoa:
//Nome: Teresa
//Idade: 14
//Altura: 1.58
//Dados da 4a pessoa:
//Nome: Carlos
//Idade: 21
//Altura: 1.65
//Dados da 5a pessoa:
//Nome: Paulo
//Idade: 17
//Altura: 1.78
//Altura média: 1.69
//Pessoas com menos de 16 anos: 40.0%
//Joao
//Teresa
// Autor(a)    : Jefferson
// Data atual  : 08/12/2023
Var

        N,i,cont:inteiro
        nomes: vetor [0..10] de caractere
        idades: vetor [0..10] de inteiro
        altura: vetor [0..10] de real
        soma,media,porcentagem:real
Inicio


        escreva("Quantas pessoas serao digitadas?")
        leia(N)
        
        
        para i de 0 ate (N-1) faca
        
             escreval("Dados da",i+1,"a pessoa:")
             
             escreva("Nome: ")
             leia(nomes[i])
             
             escreva("Idade: ")
             leia(idades[i])
             
             escreva("Altura: ")
             leia(altura[i])
             
        fimpara
        
        escreval
        
        soma<-0
        
        para i de 0 ate (N-1) faca
             soma<-(soma+altura[i])
        fimpara
        
        media<-soma/N
        
        escreval("Altura média: ",media:4:2)
        
        cont<-0
        
        para i de 0 ate (N-1) faca
             se idades[i]<16 entao
             cont<-cont+1
             fimse
        fimpara
        
        porcentagem<-cont*100/N
        
        escreval("Pessoas com menos de 16 anos: ",porcentagem:3:1,"%")
        
        para i de 0 ate (N-1) faca
             se idades[i]<16 entao
             escreval(nomes[i])
             fimse
        fimpara
        
        
        
        
        


        
        
        
        

        

        
        

        
        
        
        



Fimalgoritmo