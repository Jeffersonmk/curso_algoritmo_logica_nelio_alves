/*
Problema "maior_posicao"
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
Exemplo:
Quanto numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0
MAIOR VALOR = 14.0
POSICAO DO MAIOR VALOR = 3
*/

#include <stdio.h>

int main(){

    int N;

    printf("Quanto numeros voce vai digitar? ");
    scanf("%d", &N);

    double vetor[N];

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &vetor[i]);
    }

    double maior = vetor[0];
    int posicao;

    for (int i = 0; i < N; i++) {
        if (maior < vetor[i]) {
            maior = vetor[i];
            posicao = i;
        }
    }

    printf("\nMAIOR VALOR = %.1lf\n", maior);
    printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
    
    return 0;
}