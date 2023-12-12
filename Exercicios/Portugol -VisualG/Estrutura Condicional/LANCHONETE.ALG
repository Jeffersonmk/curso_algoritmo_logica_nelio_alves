Algoritmo "lanchonete"
//  
//  
// 
//  
// Descricao   :  Problema "lanchonete" (adaptado de URI 1038)
//Uma lanchonete possui vários produtos. Cada produto possui um código
//e um preço. Você deve fazer um programa para ler o código e a
//quantidade comprada de um produto (suponha um código válido), e daí
//informar qual o valor a ser pago, com duas casas decimais, conforme
//tabela de produtos ao lado.
//Codigo do
//produto
//1
//2
//3
//4
//5
//Preço do
//produto
//R$ 5.00
//R$ 3.50
//R$ 4.80
//R$ 8.90
//R$ 7.32
//Exemplo 1:
//Codigo do produto comprado: 1
//Quantidade comprada: 3
//Valor a pagar: R$ 15.00
//Exemplo 2:
//Codigo do produto comprado: 4
//Quantidade comprada: 2
//Valor a pagar: R$ 17.80
// Autor(a)    : Jefferson
// Data atual  : 19/10/2023
Var


       Quantidade:inteiro
       Codigo:caractere
       Pagamento:real



Inicio

      escreva("Codigo do produto comprado: ")
      leia(Codigo)
      
      escreva("Quantidade comprada: ")
      leia(Quantidade)
      
      se Codigo = "1" entao
      
         Pagamento<-5*Quantidade

         escreva("Valor a pagar: R$ ",Pagamento:4:2)

      senao
      
           se Codigo = "2" entao

               Pagamento<-3.50*Quantidade

               escreva("Valor a pagar: R$ ",Pagamento:4:2)

           senao
           
                se Codigo = "3" entao

                  Pagamento<-4.80*Quantidade

                  escreva("Valor a pagar: R$ ",Pagamento:4:2)
                  
                  senao

                       se Codigo = "4" entao

                           Pagamento<-8.90*Quantidade

                           escreva("Valor a pagar: R$ ",Pagamento:4:2)
                           
                       senao

                            se Codigo = "5" entao

                              Pagamento<-7.32*Quantidade

                              escreva("Valor a pagar: R$ ",Pagamento:4:2)

                           fimse
                       
                       fimse

                  fimse
            fimse
       fimse

Fimalgoritmo

