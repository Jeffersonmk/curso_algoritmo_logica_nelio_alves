/*
Problema "lanchonete" (adaptado de URI 1038)
Uma lanchonete possui vários produtos. Cada produto possui um código
e um preço. Você deve fazer um programa para ler o código e a
quantidade comprada de um produto (suponha um código válido), e daí
informar qual o valor a ser pago, com duas casas decimais, conforme
tabela de produtos ao lado.
Código do
produto
1
2
3
4
5
Preço do
produto
R$ 5.00
R$ 3.50
R$ 4.80
R$ 8.90
R$ 7.32
Exemplo 1:
Codigo do produto comprado: 1
Quantidade comprada: 3
Valor a pagar: R$ 15.00
Exemplo 2:
Codigo do produto comprado: 4
Quantidade comprada: 2
Valor a pagar: R$ 17.80
 */
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorPagar = 0;
        int quantidade, codigo;

        System.out.print("Código do produto comprado: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade comprada: ");
        quantidade = sc.nextInt();
        sc.close();

        if (codigo == 1) {
            valorPagar = quantidade * 5.00;
        } else if (codigo == 2) {
            valorPagar = quantidade * 3.50;
        } else if (codigo == 3) {
            valorPagar = quantidade * 4.80;
        } else if (codigo == 4) {
            valorPagar = quantidade * 8.90;
        } else if (codigo == 5) {
            valorPagar = quantidade * 7.32;
        }

        System.out.print("Valor a pagar:  R$" + String.format("%.2f", valorPagar));
    }
}
