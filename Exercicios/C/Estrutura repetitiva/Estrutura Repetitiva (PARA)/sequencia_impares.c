/*
Problema "sequencia_impares" (adaptado de URI 1067)
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
se for o caso.
Exemplo:
Digite o valor de X: 8
1
3
5
7
*/
#include <stdio.h>

int main(){

    int x;

    printf("Digite o valor de X: ");
    scanf("%d", &x);

    for (int i = 0; i < x; i++) {
        if (i % 2 == 1) {
            printf("%d\n", i);
        }
    }
    return 0;
}
