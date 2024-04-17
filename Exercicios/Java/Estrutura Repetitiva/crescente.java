/*
Problema "crescente" (adaptado de URI 1113)
Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
programa deve finalizar quando forem digitados dois valores iguais.
Exemplo:
Digite dois numeros:
5
4
DECRESCENTE!
Digite outros dois numeros:
3
8
CRESCENTE!
Digite outros dois numeros:
2
2
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y;

        System.out.println("Digite dois numeros:");
        x = sc.nextInt();
        y = sc.nextInt();

        if (x>y) {
            System.out.println("DECRESCENTE!");
        }
        else {
            System.out.println("CRESCENTE!");
        }
        while (x != y) {
            System.out.println("Digite outros dois numeros:");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x>y) {
                System.out.println("DECRESCENTE!");
            }
            else {
                System.out.println("CRESCENTE!");
            }
        }
    }
}
