Algoritmo "comerciante"
//  
//  
// 
//  
// Descricao   : Problema "comerciante"
//Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
//mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
//venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
//proporcionaram:
//* lucro < 10%
//* 10% = lucro = 20%
//* lucro > 20%
//Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
//o lucro total.
//Exemplo:
//Serao digitados dados de quantos produtos? 4
//Produto 1:
//Nome: Feijao
//Preco de compra: 10.00
//Preco de venda: 11.00
//Produto 2:
//Nome: Arroz
//Preco de compra: 12.00
//Preco de venda: 12.80
//Produto 3:
//Nome: Oleo
//Preco de compra:
//Preco de venda: 5.00
//Preco de venda: 5.70
//Produto 4:
//Nome: Sal
//Preco de compra: 3.00
//Preco de venda: 4.00
//RELATORIO:
//Lucro abaixo de 10%: 1
//Lucro entre 10% e 20%: 2
//Lucro acima de 20%: 1
//Valor total de compra: 30.00
//Valor total de venda: 33.50
//Lucro total: 3.50
// Autor(a)    : Jefferson
// Data atual  : 14/12/2023
Var


        produto:vetor [0..99] de caractere
        compra:vetor [0..99] de real
        venda:vetor [0..99] de real
        N,i,lucroAcima,lucroEntre,lucroAbaixo:inteiro
        totalVenda,totalCompra,lucroTotal,lucroPercentual,lucro:real

Inicio

      escreva("Serao digitados dados de quantos produtos? ")
      leia(N)

      para i de 0 ate N-1 faca
      
         escreval("Produto ",i+1,":")

         escreva("Nome: ")
         leia(produto[i])

         escreva("Preco de compra: ")
         leia(compra[i])
         
         escreva("Preco de venda: ")
         leia(venda[i])
         
      fimpara
      
      lucroAcima<-0
      lucroEntre<-0
      lucroAbaixo<-0
      
      para i de 0 ate N-1 faca
      
         lucro<-venda[i]-compra[i]
         lucroPercentual<-lucro*100.0/compra[i]

         se lucroPercentual<10 entao
            lucroAbaixo<-lucroAbaixo+1
         senao
               se lucroPercentual<= 20 entao
                  lucroEntre<-lucroEntre+1
               senao
                    lucroAcima<-lucroAcima+1
               fimse
         fimse
      fimpara

      totalVenda<-0
      totalCompra<-0
      
      para i de 0 ate N-1 faca
      
         totalCompra<-totalCompra+compra[i]
         totalVenda<-totalVenda+venda[i]
         
      fimpara
      
      lucroTotal<-totalVenda-totalCompra
      
      escreval("RELATORIO:")
      escreval("Lucro abaixo de 10%: ",lucroAbaixo)
      escreval("Lucro entre 10% e 20%:",lucroEntre)
      escreval("Lucro acima de 20%: ",lucroAcima)
      escreval("Valor total de compra: ",totalCompra:4:2)
      escreval("Valor total de venda: ",totalVenda:4:2)
      escreval("Lucro total: ",Lucrototal:4:2)
      
      



Fimalgoritmo