Algoritmo "experiencias"
//  
//  
// 
//  
// Descricao   : Problema "experiencias" (adaptado de URI 1094)
//Maria acabou de iniciar seu curso de gradua��o na faculdade de medicina e precisa de sua ajuda para
//organizar os experimentos de um laborat�rio o qual ela � respons�vel. Ela quer saber no final do ano,
//quantas cobaias foram utilizadas no laborat�rio e o percentual de cada tipo de cobaia utilizada. Este
//laborat�rio em especial utiliza tr�s tipos de cobaias: sapos, ratos e coelhos. Para obter estas
//informa��es, ela sabe exatamente o n�mero de experimentos que foram realizados, o tipo de cobaia
//utilizada e a quantidade de cobaias utilizadas em cada experimento. Fa�a um programa que leia um
//valor inteiro N que indica os v�rios casos de teste que vem a seguir. Cada caso de teste cont�m um
//inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
//de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
//cobaia utilizada e o percentual de cada uma em rela��o ao total de cobaias utilizadas, sendo que o
//percentual deve ser apresentado com dois d�gitos ap�s o ponto.
//Exemplo:
//Quantos casos de teste serao digitados? 10
//Quantidade de cobaias: 10
//Tipo de cobaia: C
//Quantidade de cobaias: 6
//Tipo de cobaia: R
//Quantidade de cobaias: 15
//Tipo de cobaia: S
//Quantidade de cobaias: 5
//Tipo de cobaia: C
//Quantidade de cobaias: 14
//Tipo de cobaia: R
//Quantidade de cobaias: 9
//Tipo de cobaia: C
//Quantidade de cobaias: 6
//Tipo de cobaia: R
//Quantidade de cobaias: 8
//Tipo de cobaia: S
//Quantidade de cobaias: 5
//Tipo de cobaia: C
//Quantidade de cobaias: 14
//Tipo de cobaia: R
//RELATORIO FINAL:
//Total: 92 cobaias
//Total de coelhos: 29
//Total de ratos: 40
//Total de sapos: 23
//Percentual de coelhos: 31.52
//Percentual de ratos: 43.48
//Percentual de sapos: 25.00
// Autor(a)    : Jefferson
// Data atual  : 11/11/2023
Var

    cobaia:caractere
    x,coelhos,ratos,sapos,quantidade,i:inteiro
    total,percentualC,percentualS,percentualR:real



Inicio


      escreva("Quantos casos de teste serao digitados? ")
      leia(x)
      
      coelhos<-0
      ratos<-0
      sapos<-0
      
      para i de 1 ate x faca
      
         quantidade<-0

         escreva("Quantidade de cobaias:")
         leia(quantidade)

         escreva("Tipo de cobaia: ")
         leia(cobaia)

         se cobaia = "C" entao
            coelhos<-coelhos+quantidade

          senao
              se cobaia = "R" entao

              ratos<-ratos+quantidade

              senao
                   se cobaia = "S" entao

                   sapos<-sapos+quantidade

                   fimse

              fimse

         fimse
      
      fimpara
      
      total<-coelhos+sapos+ratos
      
      percentualC<-coelhos/92*100
      
      percentualR<-ratos/92*100
      
      percentualS<-sapos/92*100
      
      
      escreval("RELATORIO FINAL:")
      escreval("Total:",total," cobaias")
      escreval("Total de coelhos:",coelhos)
      escreval("Total de ratos: ",ratos)
      escreval("Total de sapos: ",sapos)
      escreval("Percentual de coelhos:",percentualC:4:2)
      escreval("Percentual de ratos: ",percentualR:4:2)
      escreval("Percentual de sapos: ",percentualS:4:2)
      
      
           

      
      
      
      
      
      
      

      

      
      


Fimalgoritmo