/*
Problema "multiplos" (adaptado de URI 1044)
Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
números podem ser digitados em qualquer ordem.
Exemplo 1:
Digite dois numeros inteiros:
6
24
Sao multiplos
Exemplo 2:
Digite dois numeros inteiros:
24
6
Sao multiplos
Exemplo 3:
Digite dois numeros inteiros:
13
5
Nao sao multiplos
 */
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x,y,troca;

        System.out.print("Digite dois numeros inteiros: ");
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        if (y>x) {
            troca = x;
            x = y;
            y = troca;
        }
        if (x % y == 0) {
            System.out.print("Sao multiplos");
        }
        else if (x % y != 0) {
            System.out.print("Nao sao multiplos");
        }
    }
}
