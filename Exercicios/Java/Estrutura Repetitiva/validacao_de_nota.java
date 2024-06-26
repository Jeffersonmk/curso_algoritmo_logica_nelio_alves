/*
Problema "validacao_de_nota" (adaptado de URI 1117)
Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
intervalo [0,10]). Cada nota deve ser validada separadamente.
Exemplo 1:
Digite a primeira nota: 3.5
Digite a segunda nota: 10.0
MEDIA = 6.75
Exemplo 2:
Digite a primeira nota: -3.5
Valor invalido! Tente novamente: 3.5
Digite a segunda nota: 11.0
Valor invalido! Tente novamente: 10.5
Valor invalido! Tente novamente: 10.0
MEDIA = 6.75
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double primeiraNota, segundaNota, media;

        System.out.print("Digite a primeira nota: ");
        primeiraNota = sc.nextDouble();
        while (primeiraNota < 0 || primeiraNota > 10){
            System.out.print("Valor invalido! Tente novamente: ");
            primeiraNota = sc.nextDouble();
        }
        System.out.print("Digite a segunda nota: ");
        segundaNota = sc.nextDouble();
        while (segundaNota < 0 || segundaNota > 10){
            System.out.print("Valor invalido! Tente novamente: ");
            segundaNota = sc.nextDouble();
        }
        sc.close();
        media = (primeiraNota + segundaNota)/2;
        System.out.println("MEDIA = "+String.format("%.2f",media));
        }
    }
