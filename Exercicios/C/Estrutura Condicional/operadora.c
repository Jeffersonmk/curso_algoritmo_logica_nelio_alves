/*
Problema "operadora"
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
Exemplo 1:
Digite a quantidade de minutos: 22
Valor a pagar: R$ 50.00
Exemplo 2:
Digite a quantidade de minutos: 103
Valor a pagar: R$ 56.00
*/

#include <stdio.h>

int main(){

    int minutos, minutosLimite = 100, diferencaMinutos;
    double valor = 50, pagamento;
    
    printf("Digite a quantidade de minutos: ");
    scanf("%d", &minutos);

    if (minutos>100) {
        diferencaMinutos = minutos - minutosLimite;
        pagamento = (double)valor + (2 * diferencaMinutos);
        printf("Valor a pagar: R$ %.2lf\n", pagamento);
    }
    else {
        printf("Valor a pagar: R$ 50.00\n");
    }
    return 0;
}