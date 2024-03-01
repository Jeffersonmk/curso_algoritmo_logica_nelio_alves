/*
Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.
Exemplo 1:
Preço unitário do produto: 8.00
Quantidade comprada: 2
Dinheiro recebido: 20.00
TROCO = 4.00
Exemplo 2:
Preço unitário do produto: 30.00
Quantidade comprada: 3
Dinheiro recebido: 100.00
TROCO = 10.00
 */
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUnitario, dinheiroRecebido, troco, precoTotal;
        int quantidadeComprada;

        System.out.print("Preço unitário do produto: ");
        precoUnitario = sc.nextDouble();
        System.out.print("Quantidade comprada: ");
        quantidadeComprada = sc.nextInt();
        System.out.print("Dinheiro recebido: ");
        dinheiroRecebido = sc.nextDouble();

        sc.close();

        precoTotal = precoUnitario * (double) quantidadeComprada;
        troco = dinheiroRecebido - precoTotal;

        System.out.print("TROCO = " +  String.format("%.2f", troco));
    }
}