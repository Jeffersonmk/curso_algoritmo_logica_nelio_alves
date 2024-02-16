/*
Problema "cada_linha"
Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
de cada linha. Suponha não haver empates.
Exemplo:
Qual a ordem da matriz? 4
Elemento [0,0]: 5
Elemento [0,1]: -3
Elemento [0,2]: 10
Elemento [0,3]: 8
Elemento [1,0]: 15
Elemento [1,1]: 8
Elemento [1,2]: 2
Elemento [1,3]: 10
Elemento [2,0]: 7
Elemento [2,1]: 9
Elemento [2,2]: -4
Elemento [2,3]: 3
Elemento [3,0]: 8
Elemento [3,1]: -7
Elemento [3,2]: 4
Elemento [3,3]: 13
MAIOR ELEMENTO DE CADA LINHA:
10
15
9
13
*/

#include <stdio.h>

int main(){

    int N;
    double maior;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &N);

    double matriz [N][N];
    double vetor [N];

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++){
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%lf", &matriz[i][j]);
        }
    }
    
    printf("MAIOR ELEMENTO DE CADA LINHA:\n");
    for (int i = 0; i < N; i++) {
        maior = matriz [i][0];
        for (int j = 1; j < N; j++) {
            if (maior < matriz[i][j]) {
                maior = matriz [i][j];
            }
        }
        vetor[i] = maior;
    }

    for (int i = 0; i < N; i++) {
        printf("%.2lf\n", vetor[i]);
    }
    return 0;
}