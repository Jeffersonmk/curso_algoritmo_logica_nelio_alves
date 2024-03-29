/*
Problema "abaixo_da_media"
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.Exemplo:
Quantos elementos vai ter o vetor? 4
Digite um numero: 10.0
Digite um numero: 15.5
Digite um numero: 13.2
Digite um numero: 9.8
MEDIA DO VETOR = 12.125
ELEMENTOS ABAIXO DA MEDIA:
10.0
9.8
*/

#include <stdio.h>

int main(){

    int N;

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &N);

    double vetor[N];

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &vetor[i]);
    }

    double soma = 0;

    for (int i = 0; i < N; i++) {
        soma = soma + vetor[i];
    }

    double media = soma / N;
    
    printf("\nMEDIA DO VETOR = %.3lf", media);
    printf("\nELEMENTOS ABAIXO DA MEDIA:\n");

    for (int i = 0; i < N; i++) {
        if (vetor[i] < media) {
            printf("%.1lf\n", vetor[i]);
        }
    }
    return 0;
}