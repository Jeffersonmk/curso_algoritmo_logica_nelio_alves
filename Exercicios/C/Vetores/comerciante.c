/*
Problema "comerciante"
Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
 lucro < 10%
 10% ≤ lucro ≤ 20%
 lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total.
Exemplo:
Serao digitados dados de quantos produtos? 4
Produto 1:
Nome: Feijao
Preco de compra: 10.00
Preco de venda: 11.00
Produto 2:
Nome: Arroz
Preco de compra: 12.00
Preco de venda: 12.80
Produto 3:
Nome: Oleo
Preco de compra:
Preco de venda: 5.00
Preco de venda: 5.70
Produto 4:
Nome: Sal
Preco de compra: 3.00
Preco de venda: 4.00
RELATORIO:
Lucro abaixo de 10%: 1
Lucro entre 10% e 20%: 2
Lucro acima de 20%: 1
Valor total de compra: 30.00
Valor total de venda: 33.50
Lucro total: 3.50
*/

#include <stdio.h>
#include <string.h>

void ler_texto(char *buffer, int length) {
fgets(buffer, length, stdin);
strtok(buffer, "\n");
}

void limpar_entrada() {
char c;
while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int N;

    printf("Serao digitados dados de quantos produtos? ");
    scanf("%d", &N);

    char mercadoria[N][50];
    double compra[N];
    double venda[N];

    for (int i= 0; i < N; i++) {
        printf("Produto %d:\n", i+1);
        printf("Nome: ");
        ler_texto(mercadoria[i], 50);
        limpar_entrada();
        printf("Preco de compra: ");
        scanf("%lf", &compra[i]);
        printf("Preco de venda: ");
        scanf("%lf", &venda[i]);
    }
    printf("\n\nRELATORIO:\n");

    double porcentagemLucro;
    int lucroAbaixo = 0, lucroEntre = 0, lucroAcima = 0;

    for (int i = 0; i < N; i++) {
        porcentagemLucro = ((venda[i] - compra[i]) / compra[i]) * 100;
        if (porcentagemLucro < 10) {
            lucroAbaixo = lucroAbaixo + 1;
        }
        else if (porcentagemLucro >= 10 && porcentagemLucro <= 20) {
            lucroEntre = lucroEntre + 1;
        }
        else {
            lucroAcima = lucroAcima + 1;
        }
    }
    printf("Lucro abaixo de 10%%: %d\n", lucroAbaixo);
    printf("Lucro entre 10%% e 20%%: %d\n", lucroEntre);
    printf("Lucro acima de 20%%: %d\n", lucroAcima);

    double totalCompra = compra[0];
    double totalVenda = venda[0];

    for (int i = 1; i < N; i++) {
        totalCompra = totalCompra + compra[i];
        totalVenda = totalVenda + venda[i];
    }

    printf("Valor total de compra: %.2lf\n", totalCompra);
    printf("Valor total de venda: %.2lf\n", totalVenda);

    double lucroTotal;
    lucroTotal = totalVenda - totalCompra;

    printf("Lucro total: %.2lf\n", lucroTotal);
    return 0;
}