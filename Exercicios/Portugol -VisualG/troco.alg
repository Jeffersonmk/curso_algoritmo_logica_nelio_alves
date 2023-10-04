Algoritmo "troco"
// 
//  
// Descrição   : Problema "troco"
//Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
//O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
//e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
//mostrar o valor do troco a ser devolvido ao cliente.
//Exemplo 1:
//Preço unitário do produto: 8.00
//Quantidade comprada: 2
//Dinheiro recebido: 20.00
//TROCO = 4.00
//Exemplo 2:
//Preço unitário do produto: 30.00
//Quantidade comprada: 3
//Dinheiro recebido: 100.00
//TROCO = 10.00
// Autor(a)    : Jefferson
// Data atual  : 04/10/2023
Var
        preco,quantidade,dinheiro,troco,soma:real


Inicio

        escreva("Preço unitário do produto: ")
        leia(preco)
        
        escreva("Quantidade comprada: ")
        leia(quantidade)
        
        escreva("Dinheiro recebido: ")
        leia(dinheiro)
        
        soma <- preco * quantidade
        
        troco <- dinheiro - soma
        
        escreva("TROCO = ",troco:8:2)
        
        

Fimalgoritmo