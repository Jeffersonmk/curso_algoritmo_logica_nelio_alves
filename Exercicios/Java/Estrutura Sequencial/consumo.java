/*
Problema "consumo"
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.
Exemplo 1:
Distancia percorrida: 500
Combustível gasto: 38.5
Consumo medio = 12.987
Exemplo 2:
Distancia percorrida: 1108
Combustível gasto: 71.4
Consumo medio = 15.518
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int distanciaPercorrida;
        double combustivelGasto, consumoMedio;

        System.out.print("Distancia percorrida: ");
        distanciaPercorrida = sc.nextInt();
        System.out.print("Combustível gasto: ");
        combustivelGasto = sc.nextDouble();
        sc.close();

        consumoMedio = (double)distanciaPercorrida / combustivelGasto;
        System.out.println("Consumo medio: " + String.format("%.3f",consumoMedio));
    }
}