/*
Problema "divisao" (adaptado de URI 1116)
Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
Exemplo:
Quantos casos voce vai digitar? 3
Entre com o numerador: 3
Entre com o denominador: -2
DIVISAO = -1.50
Entre com o numerador: -8
Entre com o denominador: 0
DIVISAO IMPOSSIVEL
Entre com o numerador: 0
Entre com o denominador: 8
DIVISAO = 0.00
*/
#include <stdio.h>

int main(){

    int N, numerador, denominador;
    double divisao;

    printf("Quantos casos voce vai digitar? ");
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        printf("Entre com o numerador: ");
        scanf("%d", &numerador);
        printf("Entre com o denominador: ");
        scanf("%d", &denominador);

        divisao = (double)numerador / denominador;
        
        if (denominador == 0) {
            printf("DIVISAO IMPOSSIVEL\n");
        }
        else {
            printf("DIVISAO =  %.2lf\n", divisao);
        }
    }
    return 0;

}