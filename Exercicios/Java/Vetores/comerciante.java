/*
Problema "comerciante"
Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
proporcionaram:
 lucro < 10%
 10% ≤ lucro ≤ 20%
 lucro > 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como
o lucro total.
Exemplo:
Serao digitados dados de quantos produtos? 4
Produto 1:
Nome: Feijao
Preco de compra: 10.00
Preco de venda: 11.00
Produto 2:
Nome: Arroz
Preco de compra: 12.00
Preco de venda: 12.80
Produto 3:
Nome: Oleo
Preco de compra:
Preco de venda: 5.00
Preco de venda: 5.70
Produto 4:
Nome: Sal
Preco de compra: 3.00
Preco de venda: 4.00
RELATORIO:
Lucro abaixo de 10%: 1
Lucro entre 10% e 20%: 2
Lucro acima de 20%: 1
Valor total de compra: 30.00
Valor total de venda: 33.50
Lucro total: 3.50
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Serao digitados dados de quantos produtos? ");
        N = sc.nextInt();

        String[] nomes = new String[N];
        double[] compra = new double[N];
        double[] venda = new double[N];


        for (int i = 0; i < N; i++) {
            System.out.println("Produto " + (i + 1));
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Preco de compra: ");
            compra[i] = sc.nextDouble();
            System.out.print("Preco de venda: ");
            venda[i] = sc.nextDouble();
        }

        sc.close();

        int lucroAbaixo = 0;
        int lucroEntre = 0;
        int lucroAcima = 0;
        double totalCompra = 0;
        double totalVenda = 0;
        double lucroTotal;
        double porcentagemLucro;

        for (int i = 0; i < N; i++) {
            porcentagemLucro = ((venda[i] - compra[i]) / compra[i]) * 100;
            if (porcentagemLucro < 10) {
                lucroAbaixo += 1;
            } else if (porcentagemLucro >= 10 && porcentagemLucro <= 20) {
                lucroEntre += 1;
            } else {
                lucroAcima += 1;
            }
        }
        System.out.println("RELATORIO:");
        System.out.println("Lucro abaixo de 10%: " + lucroAbaixo);
        System.out.println("Lucro entre 10% e 20%: " + lucroEntre);
        System.out.println("Lucro acima de 20%: " + lucroAcima);

        for (int i = 0; i < N; i++) {
           totalCompra += compra[i];
           totalVenda += venda[i];
        }
        System.out.printf("Valor total de compra: %.2f\n", totalCompra);
        System.out.printf("Valor total de venda: %.2f\n", totalVenda);

        lucroTotal = totalVenda - totalCompra;

        System.out.printf("Lucro total: %.2f", lucroTotal);
    }
}
