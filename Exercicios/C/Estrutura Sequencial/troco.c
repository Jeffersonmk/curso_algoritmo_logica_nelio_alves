/*
Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.
Exemplo 1:
Preço unitário do produto: 8.00
Quantidade comprada: 2
Dinheiro recebido: 20.00
TROCO = 4.00
Exemplo 2:
Preço unitário do produto: 30.00
Quantidade comprada: 3
Dinheiro recebido: 100.00
TROCO = 10.00
*/
#include <stdio.h>

int main(){

    int quantidadeComprada; 
    double preco, dinheiroRecebido, troco;

    printf("Preço unitário do produto: ");
    scanf("%lf", &preco);
    
    printf("Quantidade comprada: ");
    scanf("%d", &quantidadeComprada);

    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiroRecebido);

    troco = dinheiroRecebido - (preco * quantidadeComprada);

    printf("TROCO = %.2lf\n", troco);

    return 0;
}
