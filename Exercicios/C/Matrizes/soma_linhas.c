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

    int M, N, i, j;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &M);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &N);

    double matriz[M][N];

    for (i = 0; i < M; i++) {
        printf("Digite os elementos da %da. linha:\n", i+1);
        for (j = 0; j < N; j++) {
            scanf("%lf", &matriz[i][j]);
        }
    }

    double vetor[M];

    for (i = 0; i < M; i++) {
        vetor[i] = 0;
        for (j = 0; j < N; j++) {
            vetor[i] = vetor[i] + matriz[i][j];
        }
    }

    printf("VETOR GERADO:\n");

    for (i = 0 ; i < M; i++) {
        printf("%.1lf\n", vetor[i]);
    }
    
    return 0;
}
