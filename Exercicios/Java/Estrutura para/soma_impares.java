/*
Problema "soma_impares" (adaptado de URI 1071)
Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
impares entre eles.
Exemplo 1:
Digite dois numeros:
2
9
SOMA DOS IMPARES = 15
Exemplo 2:
Digite dois numeros:
15
10
SOMA DOS IMPARES = 24
Exemplo 3:
Digite dois numeros:
6
-5
SOMA DOS IMPARES = 5
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,x,y,soma,troca;

        System.out.println("Digite dois numeros:");
        x = sc.nextInt();
        y = sc.nextInt();

        sc.close();

        if(x > y) {
            troca = y;
            y = x;
            x = troca;
        }

        soma = 0;

        for (i = x+1; i <=y-1; i++) {
            if (i%2!=0){
                soma = soma + i;
            }
        }
        System.out.print("SOMA DOS IMPARES = " +soma);
    }
}
