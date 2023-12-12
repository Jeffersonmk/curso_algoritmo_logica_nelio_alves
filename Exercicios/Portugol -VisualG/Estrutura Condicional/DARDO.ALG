Algoritmo "dardo"
//  
//  
// 
//  
// Descricao   : Problema "dardo"
//No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
//Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
//foi a maior.
//Exemplo 1:
//Digite as tres distancias:
//83.21
//79.53
//89.15
//MAIOR DISTANCIA = 89.15
//Exemplo 2:
//Digite as tres distancias:
//83.21
//87.20
//83.21
//MAIOR DISTANCIA = 87.20
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/10/2023
Var

        a,b,c,distancia:real


Inicio
        escreval("Digite as tres distancias:")
        leia(a)
        leia(b)
        leia(c)
        
        se (a>b) e (a>c) entao
        
           distancia<-a
           
        senao

             se (b>c) entao
             
             distancia<-b
             
             senao
             
                  distancia<-c
             fimse

         fimse
         
         escreva("MAIOR DISTANCIA = ",distancia:4:2)


Fimalgoritmo