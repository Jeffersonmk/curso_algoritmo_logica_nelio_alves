/*
Problema "soma_matrizes"
Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.
Exemplo:
Quantas linhas vai ter cada matriz? 2
Quantas colunas vai ter cada matriz? 3
Digite os valores da matriz A:
Elemento [0,0]: 3
Elemento [0,1]: 5
Elemento [0,2]: 2
Elemento [1,0]: 4
Elemento [1,1]: 5
Elemento [1,2]: 1
Digite os valores da matriz B:
Elemento [0,0]: 2
Elemento [0,1]: 4
Elemento [0,2]: 5
Elemento [1,0]: 1
Elemento [1,1]: 8
Elemento [1,2]: 8
MATRIZ SOMA:
5 9 7
5 13 9
*/

#include <stdio.h>

int main(){

    int M, N;

    printf("Quantas linhas vai ter cada matriz? ");
    scanf("%d", &M);
    printf("Quantas colunas vai ter cada matriz? ");
    scanf("%d", &N);

    int matrizA[M][N];

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            printf("Elemento [%d,%d]:", i, j);
            scanf("%d", &matrizA[i][j]);
        }
    }

    printf("Digite os valores da matriz B:\n");

    int matrizB[M][N];

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            printf("Elemento [%d,%d]:", i, j);
            scanf("%d", &matrizB[i][j]);
        }
    }

    int matrizC[M][N];

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
        }
    }

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            printf("%d ", matrizC[i][j]);
        }
        printf("\n");
    }
    return 0;
}