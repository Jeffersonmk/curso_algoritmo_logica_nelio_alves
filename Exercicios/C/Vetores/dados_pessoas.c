/*
Problema "dados_pessoas"
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
Exemplo:
Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75
Genero da 5a pessoa: F
Menor altura = 1.54
Maior altura = 1.83
Media das alturas das mulheres = 1.69
Numero de homens = 2
*/

#include <stdio.h>

void limpar_entrada() {
char c;
while ((c = getchar()) != '\n' && c != EOF) {}
}

int main(){

    int N;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &N);

    double altura[N];
    char genero [N];

    for (int i = 0; i < N; i++) {
        printf("Altura da %da pessoa: ", i+1);
        scanf("%lf", &altura[i]);
        printf("Genero da %da pessoa: ", i+1);
        limpar_entrada();
        genero[i] = getchar();
    }

    double menor = altura[0];
    double maior = altura[0];
    double media = 0;
    int cont = 0;

    for (int i = 0; i < N; i++) {
        if (menor > altura[i]) {
            menor = altura[i];
        }
    }
    for (int i = 0; i < N; i++) {
        if (maior < altura[i]) {
            maior = altura[i];
        }
    }
    for (int i = 0; i < N; i++) {
        if (genero[i] == 'F') {
            cont = cont + 1;
            media = media + altura[i];
        }
    }
    int contM = 0;
    for (int i = 0; i < N; i++) {
        if (genero[i] == 'M') {
            contM = contM + 1;
        }
    }
    printf("Menor altura =  %.2lf\n", menor);
    printf("Maior altura = %.2lf\n", maior);
    media = media / (double)cont;
    printf("Media das alturas das mulheres = %.2lf\n", media);
    printf("Numero de homens = %d\n", contM);

    return 0;
}
