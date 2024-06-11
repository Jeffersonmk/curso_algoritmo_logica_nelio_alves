/*
Problema "tabuada"
Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.
Exemplo:
Deseja a tabuada para qual valor? 4
4 x 1 = 4
4 x 2 = 8
4 x 3 = 12
4 x 4 = 16
4 x 5 = 20
4 x 6 = 24
4 x 7 = 28
4 x 8 = 32
4 x 9 = 36
4 x 10 = 40
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,soma;

        System.out.print("Deseja a tabuada para qual valor? ");
        N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            soma = N * i;
            System.out.println(N + " x " + i + " = " + soma);
        }
        sc.close();
    }
}
