/*
Problema "glicose"
Fazer um programa para ler a quantidade de glicose
no sangue de uma pessoa e depois mostrar na tela a
classificação desta glicose de acordo com a tabela de
referência ao lado.
Classificação
Normal
Elevado
Diabetes
Glicose
Até 100 mg/dl
Maior que 100 até
140 mg/dl
Maior de 140 mg/dl
Exemplo 1:
Digite a medida da glicose: 90.0
Classificacao: normal
Exemplo 2:
Digite a medida da glicose: 140.0
Classificacao: elevado
Exemplo 3:
Digite a medida da glicose: 143.2
Classificacao: diabetes
*/

#include <stdio.h>

int main(){

    double medidaGlicose;

    printf("Digite a medida da glicose: ");
    scanf("%lf", &medidaGlicose);

    if (medidaGlicose <= 100) {
        printf("Classificacao: normal\n");
    }
    else if (medidaGlicose <= 140) {
        printf("Classificacao: elevado\n");
    }
    else {
        printf("Classificacao: diabetes\n");
    }

    return 0;

}