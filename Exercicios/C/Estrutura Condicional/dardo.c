/*
Problema "dardo"
No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
foi a maior.
Exemplo 1:
Digite as tres distancias:
83.21
79.53
89.15
MAIOR DISTANCIA = 89.15
Exemplo 2:
Digite as tres distancias:
83.21
87.20
83.21
MAIOR DISTANCIA = 87.20
*/

#include <stdio.h>

int main(){

    double tentativa1, tentativa2, tentativa3, maior;

    printf("Digite as tres distancias:\n");
    scanf("%lf %lf %lf", &tentativa1, &tentativa2, &tentativa3);

    if ((tentativa1 > tentativa2)  && (tentativa1 > tentativa3)){
        maior = tentativa1;
    }
    else if (tentativa2 > tentativa3) {
        maior = tentativa2;
    }
    else {
        maior = tentativa3;
    }
    printf("MAIOR DISTANCIA = %.2lf\n", maior);

    return 0;

}