/*
Problema "experiencias" (adaptado de URI 1094)
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto.
Exemplo:
Quantos casos de teste serao digitados? 10
Quantidade de cobaias: 10
Tipo de cobaia: C
Quantidade de cobaias: 6
Tipo de cobaia: R
Quantidade de cobaias: 15
Tipo de cobaia: S
Quantidade de cobaias: 5
Tipo de cobaia: C
Quantidade de cobaias: 14
Tipo de cobaia: R
Quantidade de cobaias: 9
Tipo de cobaia: C
Quantidade de cobaias: 6
Tipo de cobaia: R
Quantidade de cobaias: 8
Tipo de cobaia: S
Quantidade de cobaias: 5
Tipo de cobaia: C
Quantidade de cobaias: 14
Tipo de cobaia: R
RELATORIO FINAL:
Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52
Percentual de ratos: 43.48
Percentual de sapos: 25.00
*/

#include <stdio.h>

void limpar_entrada() {
    char c;
    while ((c = getchar()) != '\n' && c != EOF) {}
}

int main() {


    int N, cobaias, coelhos, ratos, sapos, quantidadeCobaias;
    double percentualCoelhos, percentualSapos, percentualRatos;
    char tipoCobaia;

    printf("Quantos casos de teste serao digitados? ");
    scanf("%d", &N);

    coelhos = 0;
    ratos = 0;
    sapos = 0;
    cobaias = 0;

    limpar_entrada(); // Limpar o buffer de entrada após a leitura de N

    for (int i = 0; i < N; i++) {
        printf("Quantidade de cobaias: ");
        scanf("%d", &quantidadeCobaias);
        cobaias = cobaias + quantidadeCobaias;
        // Após a leitura da quantidade de cobaias com scanf(),
        // o próximo caractere na entrada de dados é uma nova linha ('\n').
        // Para garantir que a leitura do tipo de cobaia capture o caractere correto,
        // usamos scanf(" %c") com um espaço antes de %c para ignorar qualquer espaço em branco,
        // incluindo novas linhas pendentes, antes de ler o caractere tipoCobaia.
        printf("Tipo de cobaia: ");
        scanf(" %c", &tipoCobaia); 
        if (tipoCobaia == 'C') {
            coelhos = coelhos + quantidadeCobaias;
        }
        else if (tipoCobaia == 'R') {
            ratos = ratos + quantidadeCobaias;
        }
        else if (tipoCobaia == 'S') {
            sapos = sapos + quantidadeCobaias;
        }
        limpar_entrada();
    }

    printf("\nRELATORIO FINAL:\n");
    printf("Total: %d cobaias\n", cobaias);
    printf("Total de coelhos: %d\n", coelhos);
    printf("Total de ratos: %d\n", ratos);
    printf("Total de sapos: %d\n", sapos);
    percentualRatos = (double)ratos / cobaias * 100;
    percentualCoelhos = (double)coelhos / cobaias * 100;
    percentualSapos = (double)sapos / cobaias * 100;
    printf("Percentual de coelhos: %.2lf\n", percentualCoelhos);
    printf("Percentual de ratos: %.2lf\n", percentualRatos);
    printf("Percentual de sapos: %.2lf\n", percentualSapos);
    return 0;
}