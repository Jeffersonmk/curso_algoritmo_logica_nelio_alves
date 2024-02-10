/*
Problema "troco_verificado"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
valor restante conforme exemplo.
Exemplo 1:
Preço unitário do produto: 8.00
Quantidade comprada: 2
Dinheiro recebido: 20.00
TROCO = 4.00Exemplo 2:
Preço unitário do produto: 30.00
Quantidade comprada: 3
Dinheiro recebido: 70.00
DINHEIRO INSUFICIENTE. FALTAM 20.00 REAIS
*/

#include <stdio.h>

int main(){

    double precoUnitario, dinheiroRecebido, valorTotal, troco, restante;
    int quantidadeComprada;

    printf("Preço unitário do produto: ");
    scanf("%lf", &precoUnitario);
    printf("Quantidade comprada: ");
    scanf("%d", &quantidadeComprada);
    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiroRecebido);

    valorTotal = precoUnitario * quantidadeComprada;
    troco = dinheiroRecebido - valorTotal;

    if (dinheiroRecebido > valorTotal) {
        printf("TROCO = %.2lf\n", troco);
    }
    else {
        restante = valorTotal - dinheiroRecebido;
        printf("DINHEIRO INSUFICIENTE. FALTAM %.2lf REAIS\n", restante);
    }

    return 0;
}