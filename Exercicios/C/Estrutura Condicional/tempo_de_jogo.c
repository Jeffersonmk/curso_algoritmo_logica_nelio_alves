/*
Problema "tempo_de_jogo" (adaptado de URI 1046)
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
horas.
Exemplo 1:
Hora inicial: 16
Hora final: 2
O JOGO DUROU 10 HORA(S)
Exemplo 2:
Hora inicial: 0
Hora final: 0
O JOGO DUROU 24 HORA(S)
Exemplo 3:
Hora inicial: 2
Hora final: 16
O JOGO DUROU 14 HORA(S)
*/

#include <stdio.h>

int main(){

    int horaInicial, horaFinal, duracao;

    printf("Hora inicial: ");
    scanf("%d", &horaInicial);

    printf("Hora final: ");
    scanf("%d", &horaFinal);

    if (horaInicial > horaFinal) {
        duracao = (24 - horaInicial) + horaFinal;
    }
    else if (horaInicial == horaFinal) {
        duracao = 24;
    }
    else {
        duracao = horaFinal - horaInicial;
    }

    printf("O JOGO DUROU %d HORA(S)\n", duracao);

    return 0;

}