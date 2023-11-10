Algoritmo "media_ponderada"
//  
//  
// 
//  
// Descricao   : Problema "media_ponderada" (adaptado de URI 1079)
//Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
//teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
//que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
//que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
//pela soma dos pesos.
//Exemplo:
//Quantos casos voce vai digitar? 3
//Digite tres numeros:
//6.5
//4.3
//6.2
//MEDIA = 5.7
//Digite tres numeros:
//5.1
//4.2
//8.1
//MEDIA = 6.3
//Digite tres numeros:
//8.0
//9.0
//10.0
//MEDIA = 9.3
// Autor(a)    : Jefferson
// Data atual  : 10/11/2023
Var

        i,x:inteiro
        a,b,c,media:real

Inicio


        escreval("Quantos casos voce vai digitar?")
        leia(x)
        
        para i de 1 ate x faca
        
        escreval("Digite tres numeros:")
        leia(a)
        leia(b)
        leia(c)
        
        media<-(a*2+b*3+c*5)/10
        
        escreval("MEDIA = ",media:3:1)
        
        fimpara
        
        

Fimalgoritmo