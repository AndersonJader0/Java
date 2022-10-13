import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ParrotGame {

    public static void sleep(int time) {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        System.out.println("EDGARD(CAPITÃO): ARRHUUU MARINHEIRO! BEM VINDO AO JOGO!");
        sleep(3);
        System.out.println("EDGARD(CAPITÃO): É AQUI ONDE SUA JORNADA COMEÇA.");
        sleep(2);
        System.out.println("EDGARD(CAPITÃO): PRIMEIRA MISSÃO SUA SERÁ TENTAR ACORDAR O PAPAGAIO SONECA.");
        sleep(3);
        System.out.println("EDGARD(CAPITÃO): HAHAHAA, VAMOS LÁ MARUJO!");
        sleep(2);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("");

        int segundos = 0;
        int tempoSegundosFim = 5;

        System.out.println("Inicializando o jogo.");
        sleep(2);
        System.out.println("");

        while (segundos < tempoSegundosFim) {
            segundos++;
            System.out.println(segundos);
            sleep(1);
        }
        System.out.println("");
        sleep(2);
        System.out.println("O jogo começou!");
        sleep(2);
        System.out.println("");

        System.out.println("FLORA: EEI, MENINO!");
        sleep(2);
        System.out.println("FLORA: QUAL É O SEU NOME?");
        sleep(2);
        String nomePersonagem = keyboard.next();
        System.out.println("FLORA: " + nomePersonagem  + " VENHA VOU TE LEVAR ATÉ AQUELE PAPAGAIO RABUGENTO!");
        sleep(3);
        System.out.println("PASSOS...");
        sleep(3);
        System.out.println("ZZzzz");
        sleep(2);
        System.out.println("ZZZZzzzzz!");
        sleep(2);
        System.out.println("FLORA: VEJA SÓ! ELE ESTÁ DORMINDO A 3 DIAS!");
        sleep(2);
        System.out.println("FLORA: NINGUÉM NESSE NAVIO CONSEGUE ACORDA-LO.");
        sleep(2);
        System.out.println("FLORA: O QUE SABEMOS É QUE HÁ DUAS PALAVRAS QUE PODE ACORDA-LO, MAS NÃO SABEMOS QUAIS!");
        sleep(3);
        System.out.println("");
        System.out.println("Inicializando cenário...");
        System.out.println("");
        sleep(3);

        String word = "PAPAGAIO";
        String word2 = "PAPAGAIO";
        System.out.println("A MISSÃO COMEÇOU! ACORDE O PAPAGAIO!");

            int i;
            do {
                sleep(2);
                System.out.println("DIGITE A PALAVRA: ");
                word = keyboard.next();
                System.out.println("DIGITE A OUTRA PALAVRA: ");
                word2 = keyboard.next();

                if (Objects.equals(word, word2)) {
                    System.out.println("");
                    System.out.println("CÓÓ CORI CÓÓÓÓ");
                    sleep(2);
                    System.out.println("VOCÊ ACORDOU O PAPAGAIO!");
                } else {
                    System.out.println("ESSAS DUAS PALAVRAS NÃO ACORDOU O PAPAGAIO.");
                    sleep(2);
                    System.out.println("FLORA: ESTAVA A LEMBRAR ESSE PAPAGAIO NÃO GOSTA DE IMITAÇÕES, É TÃO ENGRAÇADO.");
                    sleep(2);
                }
            } while (!Objects.equals(word, word2));
    }
}