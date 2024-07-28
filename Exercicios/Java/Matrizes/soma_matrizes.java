/*
Problema "soma_matrizes"
Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.
Exemplo:
Quantas linhas vai ter cada matriz? 2
Quantas colunas vai ter cada matriz? 3
Digite os valores da matriz A:
Elemento [0,0]: 3
Elemento [0,1]: 5
Elemento [0,2]: 2
Elemento [1,0]: 4
Elemento [1,1]: 5
Elemento [1,2]: 1
Digite os valores da matriz B:
Elemento [0,0]: 2
Elemento [0,1]: 4
Elemento [0,2]: 5
Elemento [1,0]: 1
Elemento [1,1]: 8
Elemento [1,2]: 8
MATRIZ SOMA:
5 9 7
5 13 9
 */
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int M, N;

        System.out.print("Quantas linhas vai ter cada matriz? ");
        M = sc.nextInt();
        System.out.print("Quantas colunas vai ter cada matriz? ");
        N = sc.nextInt();

        int[][] matA = new int[M][N];
        int[][] matB = new int[M][N];

        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + ","  + j + "]: ");
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + ","  + j + "]: ");
                matB[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int[][] matC = new int[M][N];

        System.out.println("MATRIZ SOMA: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matC[i][j] = matA[i][j] + matB[i][j];
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matC[i][j]+" ");
            }
            System.out.println();
        }
    }
}
