/*
Problema "aumento" (adaptado de URI 1048)
Uma empresa vai conceder um aumento percentual de
salário aos seus funcionários dependendo de quanto
cada pessoa ganha, conforme tabela ao lado. Fazer um
programa para ler o salário de uma pessoa, daí mostrar
qual o novo salário desta pessoa depois do aumento,
quanto foi o aumento e qual foi a porcentagem de
aumento.
Salário atual
Até R$ 1000.00
Acima de R$ 1000.00
até R$ 3000.00
Acima de R$ 3000.00
até R$ 8000.00
Acima de R$ 8000.00
Aumento
20%
15%
10%
5%
Exemplo 1:
Digite o salario da pessoa: 2500.00
Novo salario = R$ 2875.00
Aumento = R$ 375.00
Porcentagem = 15 %
Exemplo 2:
Digite o salario da pessoa: 8000.00
Novo salario = R$ 8800.00
Aumento = R$ 800.00
Porcentagem = 10 %
*/

#include <stdio.h>

int main(){

    int porcentagem;
    double salario, novoSalario, aumento;

    printf("Digite o salario da pessoa: ");
    scanf("%lf", &salario);

    if (salario <= 1000) {
        aumento = (20.0 / 100.0) * salario;
        porcentagem = 20;
    }
    else if (salario <= 3000) {
        aumento = (15.0 / 100.0) * salario;
        porcentagem = 15;
    }
    else if (salario <= 8000) {
        aumento = (10.0 / 100.0) * salario;
        porcentagem = 10;
    }
    else {
        aumento = (5.0 / 100.0) * salario;
        porcentagem = 5;
    }

    novoSalario = aumento + salario;

    printf("Novo salario = R$ %.2lf\n", novoSalario);
    printf("Aumento = R$ %.2lf\n", aumento);
    printf("Porcentagem = %d %%\n", porcentagem);

    return 0;
}


