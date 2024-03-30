/*
Problema "operadora"
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
Exemplo 1:
Digite a quantidade de minutos: 22
Valor a pagar: R$ 50.00
Exemplo 2:
Digite a quantidade de minutos: 103
Valor a pagar: R$ 56.00
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidadeMinutos;
        double valorPagamento;

        System.out.print("Digite a quantidade de minutos: ");
        quantidadeMinutos = sc.nextInt();
        sc.close();

        if (quantidadeMinutos>100){
            valorPagamento = 50 + 2 * (quantidadeMinutos - 100);
        }
        else{
            valorPagamento = 50;
        }
        System.out.println("Valor a pagar: R$ " +String.format("%.2f", valorPagamento));
    }
}
