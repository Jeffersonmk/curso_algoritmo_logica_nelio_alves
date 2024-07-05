/*
Problema "numeros_pares"
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
Exemplo:
Quantos numeros voce vai digitar? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
NUMEROS PARES:
8 2 14 20
QUANTIDADE DE PARES = 4
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        int[] vet = new int [N];

        for (int i = 0; i < N; i++){
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        sc.close();

        int cont = 0;

        System.out.println();
        System.out.println("NUMEROS PARES:");

        for (int i = 0; i < N; i++) {
            if (vet [i] % 2 == 0) {
                System.out.print(vet[i] + " ");
                cont = cont + 1;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + cont);
    }
}
