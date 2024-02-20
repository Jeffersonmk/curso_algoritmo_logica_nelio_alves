/*
Problema "aprovados"
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
Exemplo:
Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires
*/

#include <stdio.h>
#include <string.h>

void limpar_entrada() {
char c;
while ((c = getchar()) != '\n' && c != EOF) {}
}

void ler_texto(char *buffer, int length) {
fgets(buffer, length, stdin);
strtok(buffer, "\n");
}

int main(){

    int N;

    printf("Quantos alunos serao digitados? ");
    scanf("%d", &N);

    char nomes [N][50];
    double nota1 [N];
    double nota2 [N];

    for (int i = 0; i < N; i++) {
        printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
        limpar_entrada(); // Limpar buffer de entrada
        ler_texto(nomes[i], 50);
        scanf("%lf %lf", &nota1[i], &nota2[i]);
    }

    double media [N];

    for (int i = 0; i < N; i++) {
        media[i] = (nota1[i] + nota2[i]) / 2;
    }

    printf("Alunos aprovados:\n");

    for (int i = 0; i < N; i++) {
        if (media[i] >= 6.0) {
            printf("%s\n", nomes[i]);
        }
    }
    return 0;
}
