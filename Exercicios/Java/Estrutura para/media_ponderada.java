/*
Problema "media_ponderada" (adaptado de URI 1079)
Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
pela soma dos pesos.
Exemplo:
Quantos casos voce vai digitar? 3
Digite tres numeros:
6.5
4.3
6.2
MEDIA = 5.7
Digite tres numeros:
5.1
4.2
8.1
MEDIA = 6.3
Digite tres numeros:
8.0
9.0
10.0
MEDIA = 9.3
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        double X,Y,Z,media;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.println("Digite tres numeros: ");
            X = sc.nextDouble();
            Y = sc.nextDouble();
            Z = sc.nextDouble();
            media = ((X * 2.0) + (Y * 3.0) + (Z * 5.0) ) / (10.0);
            System.out.println("MEDIA = " + String.format("%.1f", media));
        }
        sc.close();
    }
}
