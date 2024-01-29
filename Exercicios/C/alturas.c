/*
Problema "alturas"
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
Exemplo:
Quantas pessoas serao digitadas? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 15
Altura: 1.82
Dados da 2a pessoa:
Nome: Maria
Idade: 16
Altura: 1.60
Dados da 3a pessoa:
Nome: Teresa
Idade: 14
Altura: 1.58
Dados da 4a pessoa:
Nome: Carlos
Idade: 21
Altura: 1.65
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
Altura: 1.78
Altura média: 1.69
Pessoas com menos de 16 anos: 40.0%
Joao
Teresa
*/

#include <stdio.h>

void limpar_entrada() {
char c;
while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){
    int N, i, cont;
    double media, soma, porcentagem;
    char nome [20][50];
    double altura [50];
    int idade [50];

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);
    limpar_entrada();

    for (i = 0; i<N; i++) {
        printf("Dados da %da pessoa:\n", i+1);
        printf("Nome: ");
        fgets(nome[i], 20, stdin);
        limpar_entrada();
        printf("Idade: ");
        scanf("%d", &idade[i]);
        printf("Altura: ");
        scanf("%lf", &altura[i]);
    }

    cont = 0;
    soma = 0;

    for (i = 0; i<N; i++) {
        soma = soma + altura[i];
        cont = cont + 1;
    }

    media = soma / cont;

    printf("\nAltura média: %.2lf\n", media);

    cont = 0;

    for (i = 0; i<N; i++) {
        if (idade[i]<16) {
            cont = cont + 1;
        }
    }
    porcentagem = (double)cont / N * 100;
        
    printf("Pessoas com menos de 16 anos: %.1lf%%\n ", porcentagem);

    for (i = 0; i<N; i++) {
        if (idade[i]<16) {
            printf("%s\n", nome[i]);
        }
    }
}