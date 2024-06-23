/*
Problema "experiencias" (adaptado de URI 1094)
Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano,
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto.
Exemplo:
Quantos casos de teste serao digitados? 10
Quantidade de cobaias: 10
Tipo de cobaia: C
Quantidade de cobaias: 6
Tipo de cobaia: R
Quantidade de cobaias: 15
Tipo de cobaia: S
Quantidade de cobaias: 5
Tipo de cobaia: C
Quantidade de cobaias: 14
Tipo de cobaia: R
Quantidade de cobaias: 9
Tipo de cobaia: C
Quantidade de cobaias: 6
Tipo de cobaia: R
Quantidade de cobaias: 8
Tipo de cobaia: S
Quantidade de cobaias: 5
Tipo de cobaia: C
Quantidade de cobaias: 14
Tipo de cobaia: R
RELATORIO FINAL:
Total: 92 cobaias
Total de coelhos: 29
Total de ratos: 40
Total de sapos: 23
Percentual de coelhos: 31.52
Percentual de ratos: 43.48
Percentual de sapos: 25.00
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, cobaias, coelhos, ratos, sapos, quantCobaias;
        double percentualCoelhos, percentualRatos, percentualSapos;
        char tipoCobaia;

        System.out.print("Quantos casos de teste serao digitados? ");
        N = sc.nextInt();

        coelhos = 0;
        ratos = 0;
        sapos = 0;
        quantCobaias = 0;


        for (int i = 1; i <= N; i++){
            System.out.print("Quantidade de cobaias: ");
            cobaias = sc.nextInt();
            quantCobaias = quantCobaias + cobaias;
            System.out.print("Tipo de cobaia: ");
            String input = sc.next();  // Lê a entrada do usuário como uma string
            tipoCobaia = input.charAt(0);  // Captura o primeiro caractere da string
            if (tipoCobaia == 'C') {
                coelhos = coelhos + cobaias;
            } else if (tipoCobaia == 'R') {
                ratos = ratos + cobaias;
            } else if (tipoCobaia == 'S') {
                sapos = sapos + cobaias;
            }
        }
        sc.close();
        System.out.println("RELATORIO FINAL:");
        System.out.println("Total: " + quantCobaias + " cobaias");
        System.out.println("Total de coelhos: "+coelhos);
        System.out.println("Total de ratos: "+ratos);
        System.out.println("Total de sapos: "+sapos);
        percentualCoelhos = (double) coelhos / quantCobaias * 100;
        percentualRatos = (double) ratos / quantCobaias * 100;
        percentualSapos = (double) sapos / quantCobaias * 100;
        System.out.println();
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percentualCoelhos));
        System.out.println("Percentual de ratos: " + String.format("%.2f", percentualRatos));
        System.out.println("Percentual de sapos: " + String.format("%.2f", percentualSapos));
    }
}
