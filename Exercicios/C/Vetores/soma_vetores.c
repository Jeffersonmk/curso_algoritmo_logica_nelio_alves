/*
Problema "soma_vetores"
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
Exemplo:
Quantos valores vai ter cada vetor? 6
Digite os valores do vetor A:
8
2
11
14
13
20
Digite os valores do vetor B:
5
10
3
1
10
7
VETOR RESULTANTE:
13
12
14
15
23
27
*/

#include <stdio.h>

int main(){

    int N;

    printf("Quantos valores vai ter cada vetor? ");
    scanf("%d", &N);

    printf("Digite os valores do vetor A:\n");

    double vetor [N];

    for (int i = 0; i < N; i++) {
        scanf("%lf", &vetor[i]);
    }

    printf("Digite os valores do vetor B:\n");

    double vetor2 [N];

    for (int i = 0; i < N; i++) {
        scanf("%lf", &vetor2[i]);
    }

    printf("VETOR RESULTANTE:\n");

    double vetor3 [N];

    for (int i = 0; i < N; i++) {
        vetor3[i] = vetor[i] + vetor2[i];
    }

    for (int i = 0; i < N; i++) {
        vetor3[i] = vetor[i] + vetor2[i];
    }

    for (int i = 0; i < N; i++) {
        printf("%.1lf\n", vetor3[i]);
    }

    return 0;
}