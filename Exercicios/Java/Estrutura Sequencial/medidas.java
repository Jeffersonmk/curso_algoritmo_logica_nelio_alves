/*
Problema "medidas"
Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
com quatro casas decimais):
a) a área do quadrado que tem lado A
b) a área do triângulo retângulo que base A e altura B
c) a área do trapézio que tem bases A e B, e altura C
Exemplo 1:
Digite a medida A: 4.0
Digite a medida B: 3.5
Digite a medida C: 5.2
AREA DO QUADRADO = 16.0000
AREA DO TRIANGULO = 7.0000
AREA DO TRAPEZIO = 19.5000
Exemplo 2:
Digite a medida A: 7.13
Digite a medida B: 8.05
Digite a medida C: 11.912
AREA DO QUADRADO = 50.8369
AREA DO TRIANGULO = 28.6983
AREA DO TRAPEZIO = 90.4121
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double medidaA, medidaB, medidaC;
        double areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.print("Digite a medida A: ");
        medidaA = sc.nextDouble();
        System.out.print("Digite a medida B: ");
        medidaB = sc.nextDouble();
        System.out.print("Digite a medida C: ");
        medidaC = sc.nextDouble();
        sc.close();

        areaQuadrado = Math.pow(medidaA, 2);
        areaTriangulo = 0.5 * medidaA * medidaB;
        areaTrapezio = (medidaA + medidaB) * medidaC / 2.0;

        System.out.println("AREA DO QUADRADO =  " + String.format("%.4f", areaQuadrado));
        System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", areaTriangulo));
        System.out.println("AREA DO TRAPEZIO = " + String.format("%.4f", areaTrapezio));
    }
}