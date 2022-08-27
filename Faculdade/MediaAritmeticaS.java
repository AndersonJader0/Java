import java.util.Scanner;

public class MediaAritmeticaS {
    
    public static void main(String[] args) {

        double nota1, nota2, nota3, nota4;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1 : ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2 : ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a nota 3 : ");
        nota3 = entrada.nextDouble();
        System.out.println("Digite a nota 4 : ");
        nota4 = entrada.nextDouble();

        Double media;
        media = (nota1+nota2+nota3+nota4)/4;

            if (media>5){
        System.out.println("A média aritmética é = " + media);
        System.out.println("A média alcançou a aprovação!");
        }
        else if(media <= 5){
        System.out.println("A média aritmética é = " + media);
        System.out.println("A média não alcançou a aprovação");
        }
    }
}