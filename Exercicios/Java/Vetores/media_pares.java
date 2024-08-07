/*
Problema "media_pares"
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
Exemplo 1:
Quantos elementos vai ter o vetor? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
MEDIA DOS PARES = 11.0
Exemplo 2:
Quantos elementos vai ter o vetor? 3
Digite um numero: 7
Digite um numero: 9
Digite um numero: 11
NENHUM NUMERO PAR
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantos elementos vai ter o vetor? ");
        N = sc.nextInt();

        int[] vet = new int[N];

        int soma = 0;
        double media;
        int cont = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um numero: ");
            vet[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
                cont = cont + 1;
            }
        }
        media = soma / cont;

        if (media == 0){
            System.out.print("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
    }
}
