/*
Problema "glicose"
Fazer um programa para ler a quantidade de glicose
no sangue de uma pessoa e depois mostrar na tela a
classificação desta glicose de acordo com a tabela de
referência ao lado.
Classificação
Normal
Elevado
Diabetes
Glicose
Até 100 mg/dl
Maior que 100 até
140 mg/dl
Maior de 140 mg/dl
Exemplo 1:
Digite a medida da glicose: 90.0
Classificacao: normal
Exemplo 2:
Digite a medida da glicose: 140.0
Classificacao: elevado
Exemplo 3:
Digite a medida da glicose: 143.2
Classificacao: diabetes
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double medidaGlicose;

        System.out.print("Digite a medida da glicose: ");
        medidaGlicose = sc.nextDouble();
        sc.close();
        if (medidaGlicose<=100){
            System.out.print("Classificacao: normal");
        } else if (medidaGlicose<=140) {
            System.out.print("Classificacao: elevado");
        }
        else{
            System.out.print("Classificacao: diabetes");
        }
    }
}
