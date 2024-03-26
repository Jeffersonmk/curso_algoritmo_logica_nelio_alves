/*
Problema "notas"
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
mensagem "REPROVADO", conforme exemplos.
Exemplo 1:
Digite a primeira nota: 45.5
Digite a segunda nota: 31.3
NOTA FINAL = 76.8
Exemplo 2:
Digite a primeira nota: 34.0
Digite a segunda nota: 23.5
NOTA FINAL = 57.5
REPROVADO
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double primeiraNota, segundaNota, notaFinal;

        System.out.print("Digite a primeira nota: ");
        primeiraNota = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        segundaNota = sc.nextDouble();
        sc.close();

        notaFinal = primeiraNota + segundaNota;

        if (notaFinal < 60.0){
            System.out.println("NOTA FINAL = " + String.format("%.1f", notaFinal));
            System.out.println("REPROVADO");
        }
        else
            System.out.print("NOTA FINAL = " + String.format("%.1f", notaFinal));
    }
}