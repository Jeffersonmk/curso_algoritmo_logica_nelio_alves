/*
Problema "idades"
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
Exemplo:
Dados da primeira pessoa:
Nome: Maria Silva
Idade: 19
Dados da segunda pessoa:
Nome: Joao Melo
Idade 20
A idade média de Maria Silva e Joao Melo é de 19.5 anos
*/

#include <stdio.h>
#include <string.h>

void limpar_entrada() {
    char c;
    // Enquanto o caractere lido da entrada não for uma nova linha ('\n') nem o fim do arquivo (EOF),
    // continue lendo e descartando caracteres da entrada padrão (teclado).
    while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
    // Lê uma linha de texto da entrada padrão (teclado) usando fgets() e a armazena em 'buffer'.
    // 'length' define o tamanho máximo do buffer.
    fgets(buffer, length, stdin);
    
    // Remove o caractere de nova linha ('\n') do final da linha lida, substituindo-o por um caractere nulo ('\0').
    strtok(buffer, "\n");
}

int main() {

    int idade1, idade2;
    char nome1 [50], nome2 [50];
    double media;
    printf("Dados da primeira pessoa:\n");
    printf("Nome: ");
    ler_texto(nome1, 50);

    printf("Idade: ");
    scanf("%d",&idade1);

    printf("Dados da segunda pessoa:\n");
    limpar_entrada();
    printf("Nome: ");
    ler_texto(nome2, 50);

    printf("Idade: ");
    scanf("%d",&idade2);

    media = (idade1 + idade2) / 2.0;

    printf("A idade média de %s, e %s é de %.1lf anos\n", nome1, nome2, media);

    return 0;
}