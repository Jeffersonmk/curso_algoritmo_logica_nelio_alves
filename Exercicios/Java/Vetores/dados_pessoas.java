/*
Problema "dados_pessoas"
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
Exemplo:
Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61
Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75
Genero da 5a pessoa: F
Menor altura = 1.54
Maior altura = 1.83
Media das alturas das mulheres = 1.69
Numero de homens = 2
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        double[] altura = new double[N];
        char[] genero = new char[N];

        for (int i=0; i < N; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = sc.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            genero[i] = sc.next().charAt(0);
        }

        sc.close();

        double menorAltura = altura[0];
        double maiorAltura = altura[0];

        for (int i = 0; i < N; i++) {
            if (maiorAltura < altura[i]) {
                maiorAltura = altura[i];
            }
            if (menorAltura > altura[i]) {
                menorAltura = altura[i];
            }
        }
        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Menor altura = %.2f\n", maiorAltura);

        double mediaaltura = 0;
        int contMulheres = 0;

        for (int i = 0; i < N; i++) {
                if (genero[i] == 'F') {
                    mediaaltura += altura[i];
                    contMulheres++;

            }
        }

        mediaaltura /= contMulheres;


        System.out.printf("Media das alturas das mulheres = %.2f\n",mediaaltura);

        int contHomens = 0;

        for (int i = 0; i < N; i++) {
            if (genero[i] == 'M') {
                contHomens ++;
            }
        }
        System.out.println("Numero de homens = " +contHomens);
    }
}
