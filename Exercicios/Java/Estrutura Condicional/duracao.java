/*
Problema "tempo_de_jogo" (adaptado de URI 1046)
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
horas.
Exemplo 1:
Hora inicial: 16
Hora final: 2
O JOGO DUROU 10 HORA(S)
Exemplo 2:
Hora inicial: 0
Hora final: 0
O JOGO DUROU 24 HORA(S)
Exemplo 3:
Hora inicial: 2
Hora final: 16
O JOGO DUROU 14 HORA(S)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        System.out.print("Hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.print("Hora final: ");
        horaFinal = sc.nextInt();
        sc.close();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
        } else {
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
