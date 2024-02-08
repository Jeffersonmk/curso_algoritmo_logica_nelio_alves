/*
Problema "dentro_fora" (adaptado de URI 1072)
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
conforme exemplo
Exemplo:
Quantos numeros voce vai digitar? 5
Digite um numero: 14
Digite um numero: 35
Digite um numero: 10
Digite um numero: 131
Digite um numero: 8
2 DENTRO
3 FORA
*/

#include <stdio.h>

int main(){

    int N, numero, dentro, fora;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &N);

    dentro = 0;
    fora = 0;

    for (int i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%d", &numero);
        if (numero >= 10 && numero <= 20) {
            dentro = dentro + 1;
        }
        else {
            fora = fora + 1;
        }
    }
    printf("%d  DENTRO\n", dentro);
    printf("%d  FORA\n", fora);

    return 0;

}