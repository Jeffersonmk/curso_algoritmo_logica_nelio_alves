Algoritmo "baskara"
//  
//  
// 
//  
// Descricao   : Problema "baskara"
//Fazer um programa para ler os tr�s coeficientes de uma equa��o do segundo grau. Usando a f�rmula
//de Baskara, calcular e mostrar os valores das ra�zes x1 e x2 da equa��o com quatro casas decimais,
//conforme exemplo. Se a equa��o n�o possuir ra�zes reais, mostrar uma mensagem.
//Exemplo 1:
//Coeficiente a: 1
//Coeficiente b: 0
//Coeficiente c: -9
//X1 = 3.0000
//X2 = -3.0000
//Exemplo 2:
//Coeficiente a: 2
//Coeficiente b: -4.5
//Coeficiente c: 1.7
//X1 = 1.7697
//X2 = 0.4803
//Exemplo 3:
//Coeficiente a: 1
//Coeficiente b: 3
//Coeficiente c: 4
//Esta equacao nao possui raizes reais
// Autor(a)    : Jefferson Lu�s
// Data atual  : 13/10/2023
Var


        x1,x2,A,B,C,delta:real


Inicio

       escreva("Coeficiente a: ")
       leia(A)
       
       escreva("Coeficiente b: ")
       leia(B)
       
       escreva("Coeficiente c: ")
       leia (C)
       
       delta <- b^2-4*a*c
       
       se  (delta < 0) ou (a=0) entao
       
          escreval("Esta equacao nao possui raizes reais")
          
       senao
       
          x1 <- (-b + RaizQ(delta))/(2*a )
          x2 <- (-b - RaizQ(delta))/(2*a )


       escreval("X1= ",x1:8:4)
       escreval("X2= ",x2:8:4)
          
          
       fimse
       

       


Fimalgoritmo