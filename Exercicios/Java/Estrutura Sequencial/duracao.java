/*
Problema "duracao"
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
formato horas:minutos:segundos.
Exemplo 1:
Digite a duracao em segundos: 300
0:5:0
Exemplo 2:
Digite a duracao em segundos: 12506
3:28:26
Exemplo 3:
Digite a duracao em segundos: 140811
39:6:51
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos;

        System.out.print("Digite a duracao em segundos: ");
        segundos = sc.nextInt();

        sc.close();

        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}