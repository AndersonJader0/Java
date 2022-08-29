import java.util.Scanner;

public class MediaPonderadaS {
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Entre com a nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Entre com a nota 3");
        nota3 = entrada.nextDouble();
        System.out.println("Entre com a nota 4");
        nota4 = entrada.nextDouble();

        Double mediaPonderada;
        mediaPonderada = (nota1*2+nota2*2+nota3*3+nota4*3)/10;

        if (mediaPonderada<5) {
            System.out.println("A média ponderada é = " + mediaPonderada);
            System.out.println("O aluno não atingiu a média mínima!");
        } else if (mediaPonderada>=5) {
            System.out.println("A média ponderada é = " + mediaPonderada);
            System.out.println("O aluno Passou!");
        }
    }
}