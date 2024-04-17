/*
Problema "coordenadas" (adaptado de URI 1041)
Leia os valores das coordenadas X e Y de um ponto no plano
cartesiano. A seguir, determine qual o quadrante ao qual pertence o
ponto (Q1, Q2, Q3 ou Q4). Se o ponto estiver na origem, escreva a
mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva
“Eixo X” ou “Eixo Y”, conforme for a situação.
Exemplo 1:
Valor de X: 4.5
Valor de Y: -2.2
Q4
Exemplo 2:
Valor de X: 3.1
Valor de Y: 2.0
Q1
Exemplo 3:
Valor de X: 0
Valor de Y: 0
Origem
Exemplo 4:
Valor de X: 3.8
Valor de Y: 0
Eixo X
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x,y;

        System.out.print("Valor de X: ");
        x = sc.nextDouble();
        System.out.print("Valor de Y: ");
        y = sc.nextDouble();
        sc.close();

        if (x>0 && y>0) {
            System.out.print("Q1");
        } else if (x<0 && y>0) {
            System.out.print("Q2");
        } else if (x<0 && y<0) {
            System.out.print("Q3");
        } else if (x>0 && y<0) {
            System.out.println("Q4");
        } else if (x==0 && y==0) {
            System.out.print("Origem");
        } else if (x>0 && y==0) {
            System.out.print("Eixo X");
        } else {
            System.out.print("Eixo Y");
        }
    }
}
