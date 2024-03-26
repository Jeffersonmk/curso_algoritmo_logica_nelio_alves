/*
Problema "baskara"
Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
Exemplo 1:
Coeficiente a: 1
Coeficiente b: 0
Coeficiente c: -9
X1 = 3.0000
X2 = -3.0000
Exemplo 2:
Coeficiente a: 2
Coeficiente b: -4.5
Coeficiente c: 1.7
X1 = 1.7697
X2 = 0.4803
Exemplo 3:
Coeficiente a: 1
Coeficiente b: 3
Coeficiente c: 4
Esta equacao nao possui raizes reais
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A,B,C,X1,X2,delta;

        System.out.print("Coeficiente a: ");
        A = sc.nextDouble();
        System.out.print("Coeficiente b: ");
        B = sc.nextDouble();
        System.out.print("Coeficiente c: ");
        C = sc.nextDouble();
        sc.close();

        delta = Math.sqrt(B*B - 4*A*C);

        if (delta > 0) {
            X1 = (-B + delta) / (2 * A);
            X2 = (-B - delta) / (2 * A);
            System.out.println("X1 = " + String.format("%.4f", X1));
            System.out.println("X2 = " + String.format("%.4f", X2));
        }
        else {
            System.out.print("Esta equacao nao possui raizes reais");
        }
    }
}
