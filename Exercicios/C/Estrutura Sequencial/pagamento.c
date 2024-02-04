/*
Problema "pagamento"
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
uma mensagem explicativa, conforme exemplo.
Exemplo 1:
Nome: Joao Silva
Valor por hora: 50.00
Horas trabalhadas: 60
O pagamento para Joao Silva deve ser 3000.00
Exemplo 2:
Nome: Maria Dias
Valor por hora: 60.00
Horas trabalhadas: 100
O pagamento para Maria Dias deve ser 6000.00
*/

#include <stdio.h>
#include <string.h>

void ler_texto(char *buffer, int length) {
    // Lê uma linha de texto da entrada padrão (teclado) usando fgets() e a armazena em 'buffer'.
    // 'length' define o tamanho máximo do buffer.
    fgets(buffer, length, stdin);
    
    // Remove o caractere de nova linha ('\n') do final da linha lida, substituindo-o por um caractere nulo ('\0').
    strtok(buffer, "\n");
}

int main(){

    char nome [50];
    double valorHora, pagamento;
    int horasTrabalhadas;

    printf("Nome: ");
    ler_texto(nome, 50);

    printf("Valor por hora: ");
    scanf("%lf", &valorHora);

    printf("Horas trabalhadas: ");
    scanf("%d", &horasTrabalhadas);

    pagamento = valorHora * horasTrabalhadas;

    printf("O pagamento para %s deve ser de %.2lf\n", nome, pagamento);

    return 0;
}