/*
Problema "temperatura"
Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala comduas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
5
deduzir a fórmula de Celsius para Fahrenheit): C  ( F  32)
9
Exemplo 1:
Voce vai digitar a temperatura em qual escala (C/F)? F
Digite a temperatura em Fahrenheit: 75.00
Temperatura equivalente em Celsius: 23.89
Exemplo 2:
Voce vai digitar a temperatura em qual escala (C/F)? C
Digite a temperatura em Celsius: 28.15
Temperatura equivalente em Fahrenheit: 82.67
*/

#include <stdio.h>

int main() {

    char escalaTemperatura;
    double Fahrenheit, Celsius, conversao;

    printf("Voce vai digitar a temperatura em qual escala (C/F)? ");
    escalaTemperatura = getchar();

    if (escalaTemperatura == 'C') {
        printf("Digite a temperatura em Celsius: ");
        scanf("%lf", &Celsius);
        conversao = Celsius * (9.0/5.0) + 32.0;
        printf("Temperatura equivalente em Fahrenheit: %.2lf\n", conversao);  
    }
    else if (escalaTemperatura == 'F') {
        printf("Digite a temperatura em Fahrenheit: ");
        scanf("%lf", &Fahrenheit);
        conversao = (Fahrenheit - 32.0) * (5.0/9.0);
        printf("Temperatura equivalente em Fahrenheit: %.2lf\n", conversao); 
    }
    return 0;
}