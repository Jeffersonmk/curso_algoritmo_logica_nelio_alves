/*
Problema "media_pares "
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
Exemplo 1:
Quantos elementos vai ter o vetor? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
MEDIA DOS PARES = 11.0
Exemplo 2:
Quantos elementos vai ter o vetor? 3
Digite um numero: 7
Digite um numero: 9
Digite um numero: 11
NENHUM NUMERO PAR
*/

#include <stdio.h>

int main(){

    int N;

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &N);

    int vetor[N];

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &vetor[i]);
    }

    int soma = 0;
    int pares = 0;

    for (int i = 0; i < N; i++) {
        if (vetor[i] % 2 == 0) {
            soma = soma + vetor[i];
            pares = pares + 1;
        }
    }

    double media;

    if (pares == 0) {
        printf("NENHUM NUMERO PAR\n");
    }
    else {
        media = (double)soma / pares;
        printf("MEDIA DOS PARES = %.1lf\n", media);
    }
    return 0;
}