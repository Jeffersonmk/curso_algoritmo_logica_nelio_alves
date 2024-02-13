/*
Problema "negativos_matriz"
Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.
Exemplo:
Qual a quantidade de linhas da matriz? 2
Qual a quantidade de colunas da matriz? 3
Elemento [0,0]: 12
Elemento [0,1]: -8
Elemento [0,2]: 5
Elemento [1,0]: -13
Elemento [1,1]: 10
Elemento [1,2]: -6
VALORES NEGATIVOS:
-8
-13
-6
*/

#include <stdio.h>

int main(){

    int M, N;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &M);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &N);

    int matriz [M][N];

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("VALORES NEGATIVOS:\n");

    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            if (matriz[i][j] < 0) {
                printf("%d\n", matriz[i][j]);
            }
        }
    }
    return 0;
}