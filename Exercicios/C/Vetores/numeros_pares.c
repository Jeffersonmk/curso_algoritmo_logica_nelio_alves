/*
Problema "numeros_pares"
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
NUMEROS PARES:
8 2 14 20
QUANTIDADE DE PARES = 4
*/

#include <stdio.h>

int main(){

    int N;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    int vetor[N];

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vetor[i]);
    }

    int cont = 0;

    printf("\nNUMEROS PARES:\n");

    for (int i = 0; i < N; i++) {
        if (vetor[i] % 2 == 0) {
            printf("%d ", vetor[i]);
            cont = cont + 1;
        }
    }

    printf("\n\nQUANTIDADE DE PARES = %d\n", cont);

    return 0;
}