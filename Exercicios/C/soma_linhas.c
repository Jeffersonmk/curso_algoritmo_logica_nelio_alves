/*
Problema "soma_linhas"
Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.
Exemplo:
Qual a quantidade de linhas da matriz? 2
Qual a quantidade de colunas da matriz? 3
Digite os elementos da 1a. linha:
7.0
8.0
10.0
Digite os elementos da 2a. linha:
2.0
3.0
5.0
VETOR GERADO:
25.0
10.0
*/

#include <stdio.h>

int main(){

    int M, N, i, j, soma1, soma2;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &M);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &N);
    
    double matriz [M][N];

    for (i = 0; i < M; i++) {
        for (i = 0; i < N; i++) {
            printf("Digite os elementos da %d. linha:", i+1);
            scanf("%lf %lf %lf", &matriz[i][j], &matriz[i][j], &matriz[i][j] );
        }
    }

    soma1 = 0;
    soma2 = 0;

    for (i = 0; i < M; i++) {
        soma1 = matriz [i][j] + soma1;
    }

    for (j = 0; j < M; i++) {
        soma2 = matriz [i][j] + soma2;
    }

    double vetor[99];

    for (i = 0; i < N; i++) {
        vetor[i] = soma1;
        vetor[i] = soma2;
    }

    printf("VETOR GERADO:");

    for (i = 0; i < N; i++) {
        vetor[i];
    }

    return 0;
}

