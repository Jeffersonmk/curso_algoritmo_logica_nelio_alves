Algoritmo "troco_verificado"
//  
//  
// 
//  
// Descricao   : Problema "troco_verificado"
//Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
//O programa deve ler o pre�o unit�rio do produto, a quantidade de unidades compradas deste produto,
//e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
//ao cliente. Se o dinheiro dado pelo cliente n�o for suficiente, mostrar uma mensagem informando o
//valor restante conforme exemplo.
//Exemplo 1:
//Pre�o unit�rio do produto: 8.00
//Quantidade comprada: 2
//Dinheiro recebido: 20.00
//TROCO = 4.00
//Exemplo 2:
//Pre�o unit�rio do produto: 30.00
//Quantidade comprada: 3
//Dinheiro recebido: 70.00
//DINHEIRO INSUFICIENTE. FALTAM 20.00 REAIS
// Autor(a)    : Jefferson
// Data atual  : 17/10/2023
Var

        PrecoUnitario,DinheiroRecebido,Troco,ValorProduto: real
        
        quantidade:inteiro
        
        


Inicio

        escreva("Pre�o unit�rio do produto: ")
        leia(PrecoUnitario)
        
        escreva("Quantidade comprada: ")
        leia(quantidade)
        
        escreva("Dinheiro recebido: ")
        leia(DinheiroRecebido)
        
        ValorProduto<-PrecoUnitario *quantidade
        
        Troco <- DinheiroRecebido-ValorProduto
        
        se (ValorProduto<=DinheiroRecebido) entao
        
          escreva("TROCO = ",Troco:8:2)
          
        senao
        
             Troco<-ValorProduto-DinheiroRecebido
             

             escreva("DINHEIRO INSUFICIENTE.FALTAM ",Troco:4:2," REAIS")

        fimse

Fimalgoritmo