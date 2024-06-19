/*
Problema "dentro_fora" (adaptado de URI 1072)
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
conforme exemplo
Exemplo:
Quantos numeros voce vai digitar? 5
Digite um numero: 14
Digite um numero: 35
Digite um numero: 10
Digite um numero: 131
Digite um numero: 8
2 DENTRO
3 FORA
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N,X,dentro,fora;

        System.out.print("Quantos numeros voce vai digitar? ");
        N = sc.nextInt();

        dentro = 0;
        fora = 0;

        for (int i=1; i<=N; i++){
            System.out.print("Digite um numero: ");
            X = sc.nextInt();

            if (X>=10 && X<=20){
                dentro = dentro + 1;
            } else {
                fora = fora + 1;
            }
        }
        sc.close();
        System.out.println(dentro + " dentro");
        System.out.println(fora + " fora");
    }
}
