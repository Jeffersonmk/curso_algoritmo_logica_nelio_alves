Algoritmo "soma_impares"
//  
//  
// 
//  
// Descrição   : Problema "soma_impares" (adaptado de URI 1071)
//Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
//impares entre eles.
//Exemplo 1:
//Digite dois numeros:
//2
//9
//SOMA DOS IMPARES = 15
//Exemplo 2:
//Digite dois numeros:
//15
//10
//SOMA DOS IMPARES = 24
//Exemplo 3:
//Digite dois numeros:
//6
//-5
//SOMA DOS IMPARES = 5
// Autor(a)    : Jefferson
// Data atual  : 07/11/2023
Var

        x,y,i,troca,soma:inteiro


Inicio

        escreval("Digite dois numeros:")
        leia(x)
        leia(y)

        se x>y entao
        
           troca<-x

           x<-y

           y<-troca

       fimse
       
       soma<-0
       
       para i de x+1 ate y-1 faca
       
            se i% 2 <> 0 entao
            
               soma<-soma+i
               
            fimse
       fimpara
            
       escreva("SOMA DOS IMPARES =",soma)
       

            

       


Fimalgoritmo
