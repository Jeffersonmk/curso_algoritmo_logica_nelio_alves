/*
Problema "circulo"
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋. 𝑟 . Você pode
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
diretamente o valor 3.14159.
Exemplo 1:
Digite o valor do raio do circulo: 2.0
AREA = 12.566
Exemplo 2:
Digite o valor do raio do circulo: 13.2
AREA = 547.391
*/

#include <stdio.h>

int main(){

    double area, raio;

    printf("Digite o valor do raio do circulo: ");
    scanf("%lf", &raio);
    area = 3.14159 * (raio * raio);

    printf("AREA =  %.3lf\n", area);

    return 0;
}