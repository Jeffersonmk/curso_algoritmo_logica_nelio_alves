/* 
Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
Exemplo 1:
Base do retangulo: 4.0
Altura do retangulo: 5.0
AREA = 20.0000
PERIMETRO = 18.0000
DIAGONAL = 6.4031
Exemplo 2:
Base do retangulo: 10.3
Altura do retangulo: 13.1
AREA = 134.9300
PERIMETRO = 46.8000
DIAGONAL = 16.6643 
*/

#include <stdio.h>
#include <math.h>

int main(){

    double base, altura, area, perimetro, diagonal;

    printf("Base do retangulo: ");
    scanf("%lf", &base);

    printf("Altura do retangulo: ");
    scanf("%lf", &altura);

    area = base * altura;
    diagonal = sqrt(pow(base, 2) + pow(altura, 2));
    perimetro = 2 * (base+altura);
    
    printf("AREA = %.4lf\n",area);
    printf("PERIMETRO = %.4lf\n",perimetro);
    printf("DIAGONAL = %.4lf\n",diagonal);

    return 0;
}