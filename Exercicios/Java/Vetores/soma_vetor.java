/*
Problema "soma_vetor"
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
Exemplo:
Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
VALORES = 8.0
SOMA = 36.00
MEDIA = 9.00
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, i;
        double media;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        double [] vet = new double[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet [i] = sc.nextDouble();
        }
        sc.close();

        double soma = 0;
        int cont = 0;

        System.out.print("VALORES = ");
        for (i = 0; i < N; i++) {
            soma = soma + vet[i];
            cont = cont + 1;
            System.out.print(" " + vet[i]);
        }
        System.out.println();
        System.out.println("SOMA = " + String.format("%.2f", soma));
        media = soma / cont;
        System.out.print("MEDIA = " + String.format("%.2f", media));
    }
}
