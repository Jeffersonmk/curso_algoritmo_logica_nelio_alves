/* 
Problema "coordenadas" (adaptado de URI 1041)
Leia os valores das coordenadas X e Y de um ponto no plano
cartesiano. A seguir, determine qual o quadrante ao qual pertence o
ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
“Eixo X” ou “Eixo Y”, conforme for a situação.
Exemplo 1:
Valor de X: 4.5
Valor de Y: -2.2
Q4
Exemplo 2:
Valor de X: 3.1
Valor de Y: 2.0
Q1
Exemplo 3:
Valor de X: 0
Valor de Y: 0
Origem
Exemplo 4:
Valor de X: 3.8
Valor de Y: 0
Eixo X
*/

#include <stdio.h>

int main(){

    double x,y;

    printf("Valor de X: ");
    scanf("%lf", &x);
    printf("Valor de Y: ");
    scanf("%lf", &y);

    if ((x > 0 && y > 0)) {
        printf("Q1\n");
    }
    else if ((x < 0 && y > 0)) {
        printf("Q2\n");
    }
    else if ((x < 0 && y < 0)) {
        printf("Q3\n");
    }
    else if ((x > 0 && y < 0)) {
        printf("Q4\n");
    }
    else if ((x == 0 && y == 0)) {
        printf("Origem\n");
    }
    else if (y == 0) {
        printf("Eixo X\n");
    }
    else if (x == 0) {
        printf("Eixo Y\n");
    }
    return 0;
}
