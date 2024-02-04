/*
Problema "media_idades"
Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".
Exemplo 1:
Digite as idades:
31
27
46
-5
MEDIA = 34.67
Exemplo 2:
Digite as idades:
-10
IMPOSSIVEL CALCULAR
*/

#include <stdio.h>

int main(){

    int soma, idades, cont;
    double media;

    printf("Digite as idades:\n");
    scanf("%d",&idades);

    soma = 0;
    cont = 0;

    if (idades<0) {
        printf("IMPOSSIVEL CALCULAR\n");
    }
    else {
    while (idades>0) {
        cont = cont + 1;
        soma = soma + idades;
        scanf("%d",&idades);
    }
    media = (double)soma / cont; 
    printf("MEDIA = %.2lf\n", media);
    }
    return 0;
}