/*
Problema "sequencia_impares" (adaptado de URI 1067)
Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
se for o caso.
Exemplo:
Digite o valor de X: 8
1
3
5
7
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X;

        System.out.print("Digite o valor de X: ");
        X = sc.nextInt();
        sc.close();
        for (int i=1; i <= X; i++) {
            if (i%2!=0){
                System.out.println(+i);
            }
        }
    }
}
