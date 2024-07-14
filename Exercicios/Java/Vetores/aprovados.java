/*
Problema "aprovados"
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1o e 2o semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
Exemplo:
Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos alunos serao digitados? ");
        N = sc.nextInt();

        double[] numero1 = new double[N];
        double[] numero2 = new double[N];
        String[] nome = new String[N];
        double[] soma = new double[N];
        double[] media = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "o aluno:");
            sc.nextLine();
            nome[i] = sc.nextLine();
            numero1[i] = sc.nextDouble();
            numero2[i] = sc.nextDouble();
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            soma[i] = (numero1[i] + numero2[i]);
            media[i] = soma[i] / 2;
        }

        System.out.println("Alunos aprovados: ");

        for (int i = 0; i < N; i++) {
            if (media[i] >= 6.0) {
                System.out.println(nome[i]);
            }
        }
    }
}
