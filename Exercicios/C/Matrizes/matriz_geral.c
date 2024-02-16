/*
Problema "matriz_geral"
Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as
seguintes ações:
a) calcular e imprimir a soma de todos os elementos positivos da matriz.
b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
d) imprimir os elementos da diagonal principal da matriz.
e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
a matriz alterada.
Exemplo:
Qual a ordem da matriz? 3
Elemento [0,0]: 7.0
Elemento [0,1]: -8.0
Elemento [0,2]: 10.0
Elemento [1,0]: -2.0
Elemento [1,1]: 3.0
Elemento [1,2]: 5.0
Elemento [2,0]: 11.0
Elemento [2,1]: -15.0
Elemento [2,2]: 4.0
SOMA DOS POSITIVOS: 40.0
Escolha uma linha: 1
LINHA ESCOLHIDA: -2.0 3.0 5.0
Escolha uma coluna: 2
COLUNA ESCOLHIDA: 10.0 5.0 4.0
DIAGONAL PRINCIPAL: 7.0 3.0 4.0
MATRIZ ALTERADA:
7.0 64.0 10.0
4.0 3.0 5.0
11.0 225.0 4.0
*/

#include <stdio.h>

int main(){

    int N, linha, coluna;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &N);

    double matriz[N][N];

    for (int i=0; i < N; i++) {
        for (int j=0; j < N; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%lf", &matriz[i][j]);
        }
    }

    double soma = 0;

    for (int i=0; i < N; i++) {
        for (int j=0; j < N; j++) {
            if (matriz[i][j] > 0) {
                soma = soma + matriz [i][j];
            }
        }
    }
    printf("\n\nSOMA DOS POSITIVOS: %.2lf\n", soma);

    printf("\n\nEscolha uma linha: ");
    scanf("%d", &linha);
    printf("LINHA ESCOLHIDA:");

    for (int j = 0; j < N; j++) {
        printf(" %.1lf ", matriz[linha][j]);
    }

    printf("\n\nEscolha uma coluna: ");
    scanf("%d", &coluna);
    printf("COLUNA ESCOLHIDA:");

    for (int i = 0; i < N ; i++) {
        printf(" %.1lf ", matriz[i][coluna]);
    }

    printf("\n\nDIAGONAL PRINCIPAL:");

    for (int i = 0; i < N; i++) {
        printf(" %.1lf ", matriz[i][i]);
    }

    printf("\n\nMATRIZ ALTERADA:\n");

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            if (matriz[i][j] < 0) {
                matriz[i][j] =  matriz[i][j] *  matriz[i][j];
            }
        }
    }

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            printf("%.1lf ", matriz[i][j]);    
        }
        printf("\n");
    }
}

