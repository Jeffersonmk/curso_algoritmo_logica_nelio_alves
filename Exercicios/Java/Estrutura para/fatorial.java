/*
Problema "fatorial" (adaptado de URI 1153)
Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o
fatorial de N.
Exemplo 1:
Digite o valor de N: 4
FATORIAL = 24
Exemplo 2:
Digite o valor de N: 0
FATORIAL = 1
Exemplo 3:
Digite o valor de N: 6
FATORIAL = 720
Exemplo 4:
Digite o valor de N: 1
FATORIAL = 1
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i, fatorial;

        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();
        fatorial = 1;

        for (i = 1; i <= N; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("FATORIAL = " + fatorial);
        sc.close();
    }
}
