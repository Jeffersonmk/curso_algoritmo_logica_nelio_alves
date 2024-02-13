/*
Problema "lanchonete" (adaptado de URI 1038)
Uma lanchonete possui vários produtos. Cada produto possui um código
e um preço. Você deve fazer um programa para ler o código e a
quantidade comprada de um produto (suponha um código válido), e daí
informar qual o valor a ser pago, com duas casas decimais, conforme
tabela de produtos ao lado.
Código do
produto
1
2
3
4
5
Preço do
produto
R$ 5.00
R$ 3.50
R$ 4.80
R$ 8.90
R$ 7.32
Exemplo 1:
Codigo do produto comprado: 1
Quantidade comprada: 3
Valor a pagar: R$ 15.00
Exemplo 2:
Codigo do produto comprado: 4
Quantidade comprada: 2
Valor a pagar: R$ 17.80
*/

#include <stdio.h>

int main(){

    int quantidadeComprada, codigoProduto;
    double valorPagar;

    printf("Codigo do produto comprado: ");
    scanf("%d", &codigoProduto);
    printf("Quantidade comprada: ");
    scanf("%d", &quantidadeComprada);
    
    if (codigoProduto == 1) {
        valorPagar = 5.0 * quantidadeComprada;         
    }
    else if (codigoProduto == 2) {
        valorPagar = 3.50 * quantidadeComprada;       
    }
    else if (codigoProduto == 3) {
        valorPagar = 4.80 * quantidadeComprada;       
    }
    else if (codigoProduto == 4) {
        valorPagar = 8.90 * quantidadeComprada;       
    }
    else if (codigoProduto == 5) {
        valorPagar = 7.32 * quantidadeComprada;       
    }
    printf("Valor a pagar: R$%.2lf\n", valorPagar);
    return 0;
}