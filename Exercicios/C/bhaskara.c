/*Problema "baskara"
Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
Exemplo 1:
Coeficiente a: 1
Coeficiente b: 0
Coeficiente c: -9
X1 = 3.0000
X2 = -3.0000
Exemplo 2:
Coeficiente a: 2
Coeficiente b: -4.5
Coeficiente c: 1.7
X1 = 1.7697
X2 = 0.4803
Exemplo 3:
Coeficiente a: 1
Coeficiente b: 3
Coeficiente c: 4
Esta equacao nao possui raizes reais
*/

#include <stdio.h>
#include <math.h>

int main() {

    double X1,X2,a,b,c,delta;

    printf("Coeficiente a: ");
    scanf("%lf", &a);

    printf("Coeficiente b: ");
    scanf("%lf", &b);

    printf("Coeficiente c:");
    scanf("%lf", &c);


    delta = (b * b)- 4 * a * c; 

    X1 = (-b + sqrt(delta))/4;
    X2 = (-b - sqrt(delta))/4;

    printf("X1 = %.4lf\n", X1);
    printf("X2 = %.4lf\n", X2);


    return 0;
}