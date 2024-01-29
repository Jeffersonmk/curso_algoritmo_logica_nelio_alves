/*
Problema "negativos"
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: -2
Digite um numero: 9
Digite um numero: 10
Digite um numero: -3
Digite um numero: -7
NUMEROS NEGATIVOS:
-2
-3
-7
Problema "soma_vetor"
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
VALORES = 8.0
SOMA = 36.00
MEDIA = 9.00
4.0
10.0
14.0
*/

#include <stdio.h>

int main(){
    int N, i, cont;
    double soma, media;
    double vetor [10];

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d",&N);

    for (i = 0; i < N; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &vetor[i]);
    }

    printf("\nVALORES = ");

    for (i = 0; i < N; i++) {
        printf("%.1lf  ",vetor[i]);
    }

    soma = 0;
    cont = 0;

    for (i = 0; i < N; i++) {
        soma = soma + vetor[i];
        cont = cont + 1;
    }

    media = soma / cont;

    printf("\nSOMA =  %.2lf\n",soma);
    printf("MEDIA = %.2lf\n",media);

    return 0;

}