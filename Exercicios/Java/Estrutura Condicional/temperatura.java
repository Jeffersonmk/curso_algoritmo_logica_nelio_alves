/*
Problema "temperatura"
Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para
isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala comduas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
5
deduzir a fórmula de Celsius para Fahrenheit): C  ( F  32)
9
Exemplo 1:
Voce vai digitar a temperatura em qual escala (C/F)? F
Digite a temperatura em Fahrenheit: 75.00
Temperatura equivalente em Celsius: 23.89
Exemplo 2:
Voce vai digitar a temperatura em qual escala (C/F)? C
Digite a temperatura em Celsius: 28.15
Temperatura equivalente em Fahrenheit: 82.67
 */
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char temperatura;
        double Fahrenheit, Celsius;

        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
        temperatura = sc.next().charAt(0);
        if (temperatura == 'F'){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            Fahrenheit = sc.nextDouble();
            Celsius = 0.5555 * (Fahrenheit - 32);
            System.out.print("Temperatura equivalente em Celsius: " +String.format("%.2f", Celsius));
        } else if (temperatura == 'C') {
            System.out.print("Temperatura equivalente em Celsius: ");
            Celsius = sc.nextDouble();
            Fahrenheit = 1.8 * Celsius + 32;
            System.out.print("Temperatura equivalente em Fahrenheit: "+String.format("%.2f", Fahrenheit));
        }
        sc.close();
    }
}

