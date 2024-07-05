/*
Problema "alturas"
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
Exemplo:
Quantas pessoas serao digitadas? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 15
Altura: 1.82
Dados da 2a pessoa:
Nome: Maria
Idade: 16
Altura: 1.60
Dados da 3a pessoa:
Nome: Teresa
Idade: 14
Altura: 1.58
Dados da 4a pessoa:
Nome: Carlos
Idade: 21
Altura: 1.65
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
Altura: 1.78
Altura média: 1.69
Pessoas com menos de 16 anos: 40.0%
Joao
Teresa
 */
import java.util.Scanner;

public class Main {
    private static java.lang.String[] String;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantas pessoas serao digitadas? ");
        N = sc.nextInt();

        int[] idade = new int[N];
        double[] altura = new double[N];
        String[] nomes = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }
        sc.close();

        double mediaAltura;
        double soma = 0;
        int cont = 0;
        int menor = 0;
        double porcentagem;

        for (int i = 0; i < N; i++) {
            soma = soma + altura[i];
            cont = cont + 1;
            if (idade[i] < 16){
                menor = menor + 1;
            }
        }
        mediaAltura = soma / (double)cont;
        System.out.println();
        System.out.printf("Altura média: %.2f\n", mediaAltura);
        porcentagem = (menor / (double)N) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);
        System.out.println();

        for (int i = 0; i < N; i++) {
            if (idade[i] < 16 ) {
                System.out.println(nomes[i]);
            }
        }
    }
}
