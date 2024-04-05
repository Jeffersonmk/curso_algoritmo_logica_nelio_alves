/*
Problema "dardo"
No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
foi a maior.
Exemplo 1:
Digite as tres distancias:
83.21
79.53
89.15
MAIOR DISTANCIA = 89.15
Exemplo 2:
Digite as tres distancias:
83.21
87.20
83.21
MAIOR DISTANCIA = 87.20
 */
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite as três distâncias:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();

        if (a > b && a > c) {
            System.out.println("MAIOR DISTÂNCIA = " + String.format("%.2f", a));
        } else if (b > c) {
            System.out.println("MAIOR DISTÂNCIA = " + String.format("%.2f", b));
        } else {
            System.out.println("MAIOR DISTÂNCIA = " + String.format("%.2f", c));
        }
    }
}

