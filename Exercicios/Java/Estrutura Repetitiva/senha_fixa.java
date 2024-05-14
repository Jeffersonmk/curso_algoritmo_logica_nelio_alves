/*
Problema "senha_fixa" (adaptado de URI 1114)
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
encerrado. Considere que a senha correta é o valor 2002.
Exemplo:
Digite a senha: 2312
Senha Invalida! Tente novamente: 2010
Senha Invalida! Tente novamente: 1022
Senha Invalida! Tente novamente: 2002
Acesso permitido!
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.print("Digite a senha: ");
        senha = sc.nextInt();
        while (senha!=2312) {
            System.out.print("Senha Invalida! Tente novamente: ");
            senha = sc.nextInt();
        }
        sc.close();
        System.out.print("Acesso permitido!");
        }
}
