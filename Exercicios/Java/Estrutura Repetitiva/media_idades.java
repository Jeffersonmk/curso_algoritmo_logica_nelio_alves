/*
Problema "media_idades"
Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".
Exemplo 1:
Digite as idades:
31
27
46
-5
MEDIA = 34.67
Exemplo 2:
Digite as idades:
-10
IMPOSSIVEL CALCULAR
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double media;
        int idades, cont;

        System.out.println("Digite as idades: ");
        idades = sc.nextInt();
        cont = 0;
        media = 0;
        if (idades<0) {
            System.out.print("IMPOSSIVEL CALCULAR");
        } else {
            while (idades>=0) {
                cont = cont + 1;
                media = (double)idades + media;
                idades = sc.nextInt();
            }
            sc.close();
            media = media/cont;
            System.out.print("MEDIA = "+ String.format("%.2f",media));
        }
    }
}

