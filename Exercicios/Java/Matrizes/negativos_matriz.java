/*
Problema "negativos_matriz"
Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.
Exemplo:
Qual a quantidade de linhas da matriz? 2
Qual a quantidade de colunas da matriz? 3
Elemento [0,0]: 12
Elemento [0,1]: -8
Elemento [0,2]: 5
Elemento [1,0]: -13
Elemento [1,1]: 10
Elemento [1,2]: -6
VALORES NEGATIVOS:
-8
-13
-6
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int M, N;

        System.out.print("Qual a quantidade de linhas da matriz? ");
        M = sc.nextInt();
        System.out.print("Qual a quantidade de colunas da matriz? ");
        N = sc.nextInt();

        int [][] mat = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        sc.close();

        System.out.println("VALORES NEGATIVOS: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    System.out.println(mat[i][j]);
                }
            }
        }

    }
}
