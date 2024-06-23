/*
Problema "par_impar" (adaptado de URI 1074)
Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
apenas NULO.
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: -5
IMPAR NEGATIVO
Digite um numero: 0
NULO
Digite um numero: 3
IMPAR POSITIVO
Digite um numero: -4
PAR NEGATIVO
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,X;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.println("Digite um numero: ");
            X = sc.nextInt();
            if (X == 0) {
                System.out.println("NULO");
            }else if (X % 2 == 0 && X > 0){
                System.out.println("PAR POSITIVO");
            } else if (X % 2 != 0 && X > 0) {
                System.out.println("IMPAR POSITIVO");
            } else if (X % 2 == 0 && X < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (X % 2 != 0 && X < 0) {
                System.out.println("IMPAR POSITIVO");
            }
        }
        sc.close();
    }
}
