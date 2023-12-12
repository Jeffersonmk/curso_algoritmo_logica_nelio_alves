Algoritmo "lanchonete2"
//  
//  
// 
//  
// Descricao   : Problema "lanchonete" (adaptado de URI 1038)
//Uma lanchonete possui vários produtos. Cada produto possui um código
//e um preço. Você deve fazer um programa para ler o código e a
//quantidade comprada de um produto (suponha um código válido), e daí
//informar qual o valor a ser pago, com duas casas decimais, conforme
//tabela de produtos ao lado.
//Código do
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
// Data atual  : 23/10/2023
Var
        Codigo,Quantidade:inteiro
        Valor:Real


Inicio

        escreva("Codigo do produto comprado: ")
        leia(Codigo)
        escreva("Quantidade comprada: ")
        leia(Quantidade)
        

        escolha Codigo
        
        caso 1
        
        Valor <- 5.0 * Quantidade
        
        caso 2
        
        Valor<- 3.50 * Quantidade
        
        caso 3
        
        Valor<- 4.80 * Quantidade
        
        caso 4
        
        Valor<- 8.90 * Quantidade
        
        caso 5
        
        Valor<- 7.32 * Quantidade
        
        fimescolha
        
        escreva("Valor a pagar: R$ ",Valor:4:2)
        
        
        


Fimalgoritmo