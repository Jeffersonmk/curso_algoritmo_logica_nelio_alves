/*
Problema "menor_de_tres"
Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
números lidos. Em caso de empate, mostrar apenas uma vez.
Exemplo 1:
Primeiro valor: 7
Segundo valor: 3
Terceiro valor: 8
MENOR = 3
Exemplo 2:
Primeiro valor: 5
Segundo valor: 12
Terceiro valor: 5
MENOR = 5
Exemplo 3:
Primeiro valor: 9
Segundo valor: 9
Terceiro valor: 9
MENOR = 9
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int valor1,valor2,valor3;

        System.out.print("Primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        valor2 = sc.nextInt();
        System.out.print("Terceiro valor: ");
        valor3 = sc.nextInt();
        sc.close();

        if (valor1 < valor2 && valor1 < valor3) {
            System.out.println("MENOR = " + valor1);
        }
        else if (valor2 < valor3) {
            System.out.println("MENOR = " + valor2);
        }
        else {
            System.out.println("MENOR = " + valor3);
        }
    }
}
