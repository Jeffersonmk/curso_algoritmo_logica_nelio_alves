/*
Problema "soma_linhas"
Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.
Exemplo:
Qual a quantidade de linhas da matriz? 2
Qual a quantidade de colunas da matriz? 3
Digite os elementos da 1a. linha:
7.0
8.0
10.0
Digite os elementos da 2a. linha:
2.0
3.0
5.0
VETOR GERADO:
25.0
10.0
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M, N;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        M = sc.nextInt();

        System.out.print("Qual a quantidade de colunas da matriz? ");
        N = sc.nextInt();

        double[][] mat = new double[M][N];

        for (int i = 0; i < M; i++) {
            System.out.println("Digite os elementos da " + (i + 1) + "a. linha:");
            for (int j = 0; j < N; j++) {
                mat[i][j] = sc.nextDouble();
            }
        }
        sc.close();

        double[] soma = new double[M];

        for (int i = 0; i < M; i++) {
            soma[i] = 0;
            for (int j = 0; j < N; j++){
                soma[i] = soma[i] + mat[i][j];
            }
        }

        System.out.println("VETOR GERADO:");
        for (int i = 0; i < M; i++) {
            System.out.println(soma[i]);
        }
    }
}
