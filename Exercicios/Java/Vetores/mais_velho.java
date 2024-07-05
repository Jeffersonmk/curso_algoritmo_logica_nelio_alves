/*
Problema "mais_velho"
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 2a pessoa:
Nome: Maria
Idade: 21
Dados da 3a pessoa:
Nome: Teresa
Idade: 15
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Quantas pessoas voce vai digitar? ");
        N = sc.nextInt();

        int[] idade = new int[N];
        String[] nomes = new String[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        sc.close();

        int cont = idade[0];
        String maisVelho = nomes[0];

        for (int i = 0; i < N; i++){
            if (cont < idade[i]){
                cont = idade[i];
                maisVelho = nomes[i];
            }
        }
        System.out.print("PESSOA MAIS VELHA: " +maisVelho);
    }
}
