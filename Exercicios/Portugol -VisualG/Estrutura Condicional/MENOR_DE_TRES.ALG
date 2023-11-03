Algoritmo "menor_de_tres"
//  
//  
// 
//  
// Descrição   : Problema "menor_de_tres"
//Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
//números lidos. Em caso de empate, mostrar apenas uma vez.
//Exemplo 1:
//Primeiro valor: 7
//Segundo valor: 3
//Terceiro valor: 8
//MENOR = 3
//Exemplo 2:
//Primeiro valor: 5
//Segundo valor: 12
//Terceiro valor: 5
//MENOR = 5
//Exemplo 3:
//Primeiro valor: 9
//Segundo valor: 9
//Terceiro valor: 9
//MENOR = 9
// Autor(a)    : Jefferson
// Data atual  : 16/10/2023
Var

        Valor1,Valor2,Valor3,menor:inteiro


Inicio

        escreval("Primeiro valor: ")
        leia(Valor1)
        
        escreval("Segundo valor: ")
        leia(Valor2)
        
        escreval("Terceiro valor: ")
        leia(Valor3)
        
        se (Valor1<Valor2) e (Valor1<Valor3) entao

           menor<-Valor1

        senao
             se Valor2<Valor3 entao
                menor<-Valor2

             senao
                  menor<-Valor3
             fimse
        fimse
        
        escreva("MENOR = ",menor)
        

Fimalgoritmo




