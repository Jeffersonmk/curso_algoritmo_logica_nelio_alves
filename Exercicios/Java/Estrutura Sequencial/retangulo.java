/*
Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
Exemplo 1:
Base do retangulo: 4.0
Altura do retangulo: 5.0
AREA = 20.0000
PERIMETRO = 18.0000
DIAGONAL = 6.4031
Exemplo 2:
Base do retangulo: 10.3
Altura do retangulo: 13.1
AREA = 134.9300
PERIMETRO = 46.8000
DIAGONAL = 16.6643
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double baseRetangulo, alturaRetangulo, area, perimetro, diagonal;

        System.out.print("Base do retangulo: ");
        baseRetangulo = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        alturaRetangulo = sc.nextDouble();

        sc.close();

        area = baseRetangulo *  alturaRetangulo;
        perimetro = 2 * (baseRetangulo + alturaRetangulo);
        diagonal = Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));

        System.out.println("AREA = " + String.format("%.4f", area));
        System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
        System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
    }
}
