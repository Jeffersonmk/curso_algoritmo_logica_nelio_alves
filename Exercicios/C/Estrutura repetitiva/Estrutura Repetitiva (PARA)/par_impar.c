/*
Problema "par_impar" (adaptado de URI 1074)
Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
apenas NULO.
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: -5
IMPAR NEGATIVO
Digite um numero: 0
NULO
Digite um numero: 3
IMPAR POSITIVO
Digite um numero: -4
PAR NEGATIVO
*/

#include <stdio.h>

int main(){

    int N, numero;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &numero);

        if (numero % 2 == 0 && numero < 0) {
            printf("PAR NEGATIVO\n");
        }
        else if (numero % 2 == 0 && numero > 0) {
            printf("PAR POSITIVO\n");
        }
        else if (numero % 2 != 0 && numero > 0) {
            printf("IMPAR POSITIVO\n");
        }
        else if (numero == 0) {
            printf("NULO\n");
        }
        else {
                printf("IMPAR NEGATIVO\n");
        }
    }
    return 0;
}