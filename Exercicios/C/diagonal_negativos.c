/*
Problema "diagonal_negativos"
Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
negativos da matriz.
Exemplo:
Qual a ordem da matriz? 3
Elemento [0,0]: 5
Elemento [0,1]: -3
Elemento [0,2]: 10
Elemento [1,0]: 15
Elemento [1,1]: 8
Elemento [1,2]: 2
Elemento [2,0]: 7
Elemento [2,1]: 9
Elemento [2,2]: -4
DIAGONAL PRINCIPAL:
5 8 -4
QUANTIDADE DE NEGATIVOS = 2
*/

#include <stdio.h>

int main(){
    
    int N, i, j, cont;

    printf("Qual a ordem da matriz? ");
    scanf("%d",&N);

    int matriz [N][N];

    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) {
            printf("Elemento [%d,%d]: ",i, j);
            scanf("%d", &matriz[i][j]);
        }
    }

    printf("DIAGONAL PRINCIPAL:\n");

    for (i = 0; i < N; i++) {
        printf("%d ",matriz[i][i]);
        }

    cont = 0;

    for (i = 0; i < N; i++) {
        for (j = 0; j < N; j++) {
            if (matriz[i][j] < 0) {
                cont = cont + 1;
            }
        }
    }
    printf("\nQUANTIDADE DE NEGATIVOS = %d\n", cont);
    
    return 0;
    }


