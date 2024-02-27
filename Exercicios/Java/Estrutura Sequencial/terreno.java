/*
Problema "terreno"
//Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
//casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
//o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
//duas casas decimais, conforme exemplo.
//Exemplo 1:
//Digite a largura do terreno: 10.0
//Digite o comprimento do terreno: 30.0
//Digite o valor do metro quadrado: 200.00
//Area do terreno = 300.00
//Preco do terreno = 60000.00
//Exemplo 2:
//Digite a largura do terreno: 12.0
//Digite o comprimento do terrano: 20.0
//Digite o valor do metro quadrado: 150.00
//Area do terreno = 240.00
Preco do terreno = 36000.00
*/
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura, comprimento, valorMetro, area, preco;

        System.out.print("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.print("Digite o valor do metro quadrado: ");
        valorMetro = sc.nextDouble();

        sc.close();

        area = largura * comprimento;
        preco = area * valorMetro;

        System.out.println("Area do terreno = " + String.format("%.2f", area));
        System.out.println("Preco do terreno = " + String.format("%.2f", preco));

    }
}