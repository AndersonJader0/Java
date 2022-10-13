import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cronometro {

    public static void sleep(int time) {
        try { TimeUnit.MILLISECONDS.sleep(time); } catch (InterruptedException e) { System.out.println(e);}
    }

    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);
        int minutos = 0, segundos = 0, decimos = 0;
        int tempoSegundosFim = 5;

        System.out.println("Quanto tempo em segundos vc quer o cronometro?");
        tempoSegundosFim = leitor.nextInt();

        while(segundos < tempoSegundosFim) {
            decimos++;
            if(decimos > 9) {
                decimos = 0;
                segundos++;
            }
            System.out.println("["+minutos+":"+segundos+":"+decimos+"]");
            sleep(100);
        }

    }
}