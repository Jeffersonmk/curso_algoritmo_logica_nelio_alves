/*
Problema "multiplos" (adaptado de URI 1044)
Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
números podem ser digitados em qualquer ordem.
Exemplo 1:
Digite dois numeros inteiros:
6
24
Sao multiplos
Exemplo 2:
Digite dois numeros inteiros:
24
6
Sao multiplos
Exemplo 3:
Digite dois numeros inteiros:
13
5
Nao sao multiplos
*/

#include <stdio.h>

int main(){

    int x, y, troca;

    printf("Digite dois numeros inteiros: \n");
    scanf("%d %d", &x, &y);
    if ((x % y == 0) || (y % x == 0)) {
        printf("Sao multiplos\n");
    }
    else {
        printf("Nao sao multiplos\n");
    }
    return 0;
}