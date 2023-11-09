Algoritmo "dentro_fora"
//  
//  
// 
//  
// Descrição   : Problema "dentro_fora" (adaptado de URI 1072)
//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
//conforme exemplo
//Exemplo:
//Quantos numeros voce vai digitar? 5
//Digite um numero: 14
//Digite um numero: 35
//Digite um numero: 10
//Digite um numero: 131
//Digite um numero: 8
//2 DENTRO
//3 FORA
// Autor(a)    : Jefferson
// Data atual  : 11/9/2023
Var

        x,dentro,fora,numero,i:inteiro


Inicio

        escreva("Quantos numeros voce vai digitar?")
        leia(x)
        
        dentro<-0
        fora<-0
        
        para i de 1 ate x faca
        
           escreva("Digite um numero:")
           leia(numero)

           se (numero>=10) e (numero<=20) entao

              dentro<-dentro+1

           senao
           
                fora<-fora+1

           fimse
        
        fimpara
        
        
        escreval(dentro," DENTRO")
        escreva(fora," FORA")
        
        
        
        
        
        
        

Fimalgoritmo