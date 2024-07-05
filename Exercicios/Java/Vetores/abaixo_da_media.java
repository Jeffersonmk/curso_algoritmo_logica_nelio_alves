/*
Problema "abaixo_da_media"
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
Exemplo:
Quantos elementos vai ter o vetor? 4
Digite um numero: 10.0
Digite um numero: 15.5
Digite um numero: 13.2
Digite um numero: 9.8
MEDIA DO VETOR = 12.125
ELEMENTOS ABAIXO DA MEDIA:
10.0
9.8
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        double cont = 0;
        double media;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextDouble();
            cont = vet[i] + cont;
        }
        sc.close();
        
        media = cont / (double)N;

        System.out.println();
        System.out.printf("MEDIA DO VETOR = %.3f\n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i < N; i++) {
            if (vet[i] < media) {
                System.out.println(vet[i]);
            }
        }
    }
}
