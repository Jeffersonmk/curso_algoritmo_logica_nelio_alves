/*
Problema "soma_vetores"
Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.
Exemplo:
Quantos valores vai ter cada vetor? 6
Digite os valores do vetor A:
8
2
11
14
13
20
Digite os valores do vetor B:
5
10
3
1
10
7
VETOR RESULTANTE:
13
12
14
15
23
27
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos valores vai ter cada vetor? ");
        N = sc.nextInt();

        int[] valor1 = new int[N];
        int[] valor2 = new int[N];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < N; i++) {
            valor1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < N; i++) {
            valor2[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("VETOR RESULTANTE:");

        int[] valor3 = new int[N];

        for (int i = 0; i < N; i++) {
            valor3[i] = valor1[i] + valor2[i];
            System.out.println(valor3[i]);
        }
    }
}
