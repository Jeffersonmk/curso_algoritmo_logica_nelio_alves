/*
Problema "mais_velho"
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 2a pessoa:
Nome: Maria
Idade: 21
Dados da 3a pessoa:
Nome: Teresa
Idade: 15
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos
*/

#include <stdio.h>

int main() {

    int N;

    printf("Quantas pessoas voce vai digitar? ");
    scanf("%d", &N);

    char nome[N][30];
    int idade[N];

    for (int i = 0; i < N; i++) {
        printf("Dados da %da pessoa:  \n", i + 1);
        printf("Nome: ");
        scanf("%s", &nome[i][0]);
        printf("Idade: ");
        scanf("%d", &idade[i]);
    }

    int maior = idade[0];
    int posicao = 0;

    for (int i = 1; i < N; i++) {
        if (idade[i] > maior) {
            maior = idade[i];
            posicao = i;
        }
    }
    printf("PESSOA MAIS VELHA: %s\n", nome[posicao]);

    return 0;
}

