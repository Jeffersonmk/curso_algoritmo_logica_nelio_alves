/*
Problema "diagonal_negativos"
Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
negativos da matriz.
Exemplo:
Qual a ordem da matriz? 3
Elemento [0,0]: 5
Elemento [0,1]: -3
Elemento [0,2]: 10
Elemento [1,0]: 15
Elemento [1,1]: 8
Elemento [1,2]: 2
Elemento [2,0]: 7
Elemento [2,1]: 9
Elemento [2,2]: -4
DIAGONAL PRINCIPAL:
5 8 -4
QUANTIDADE DE NEGATIVOS = 2
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Qual a ordem da matriz? ");
        N = sc.nextInt();

        int[][] mat = new int [N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [ " + i + ", " + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < N; i++) {
            System.out.print(mat[i][i] + " ");
            }

        int negativos = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    negativos += 1;
                }
            }
        }
        System.out.println();
        System.out.print("QUANTIDADE DE NEGATIVOS = " + negativos);
    }
}
