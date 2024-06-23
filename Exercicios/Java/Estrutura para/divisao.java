/*
Problema "divisao" (adaptado de URI 1116)
Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.
Exemplo:
Quantos casos voce vai digitar? 3
Entre com o numerador: 3
Entre com o denominador: -2
DIVISAO = -1.50
Entre com o numerador: -8
Entre com o denominador: 0
DIVISAO IMPOSSIVEL
Entre com o numerador: 0
Entre com o denominador: 8
DIVISAO = 0.00
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, numerador, denominador;
        double divisao;

        System.out.print("Quantos casos voce vai digitar? ");
        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextInt();
            if (denominador == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                divisao = (double) numerador / (double) denominador;
                System.out.println("DIVISAO = " + String.format("%.2f", divisao));
            }
        }
        sc.close();
    }
}
