Algoritmo "quadrante"
//  
//  
// 
//  
// Descrição   : Problema "quadrante" (adaptado de URI 1115)
//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no
//sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence (Q1, Q2, Q3 ou Q4). O
//algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem
//escrever mensagem alguma).
//Exemplo:
//Digite os valores das coordenadas X e Y:
//2
//2
//QUADRANTE Q1
//Digite os valores das coordenadas X e Y:
//3
//-2
//QUADRANTE Q4
//Digite os valores das coordenadas X e Y:
//-8
//-1
//QUADRANTE Q3
//Digite os valores das coordenadas X e Y:
//-7
//1
//QUADRANTE Q2
//Digite os valores das coordenadas X e Y:
//0
//2
// Autor(a)    : Jefferson
// Data atual  : 11/2/2023
Var

        x,y:real


Inicio


       escreval("Digite os valores das coordenadas X e Y: ")
       
       leia(x)
       leia(y)
       
       enquanto (x<>0) e (y<>0) faca
       
       
       se (x>0) e (y>0) entao
           escreval("QUADRANTE Q1")
       senao
          se (x<0) e (y>0) entao
             escreval("QUADRANTE Q2")
          senao
               se (x<0) e (y<0) entao
                 escreval("QUADRANTE Q3")
               senao
                  se (x>0) e (y<0) entao
                    escreval("QUADRANTE Q4")
                  fimse
               fimse
          fimse
      fimse
      
      escreval("Digite os valores das coordenadas X e Y: ")

      leia(x)
      leia(y)
      
      fimenquanto
      
      
      
     
Fimalgoritmo