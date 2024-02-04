/*
Problema "duracao"
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
formato horas:minutos:segundos.
Exemplo 1:
Digite a duracao em segundos: 300
0:5:0
Exemplo 2:
Digite a duracao em segundos: 12506
3:28:26
Exemplo 3:
Digite a duracao em segundos: 140811
39:6:51
*/
#include <stdio.h>

int main(){

    int horas, minutos, segundos, resto;

    printf("Digite a duracao em segundos: ");
    scanf("%d", &segundos);

    horas = segundos / 3600;
    resto = segundos % 3600;
    minutos = resto / 60;
    segundos = resto % 60;

    printf("%d:%d:%d\n", horas, minutos, segundos);
    
    return 0;
}



