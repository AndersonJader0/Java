import java.util.Scanner;

public class FormulaCasamento {
    public static void main (String[] args){

        int age, maxAge, minAge, calculate; /* "n" = idade máxima e "p" = idade mínima. */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Esse é um programinha para calcular a idade ideal para se casar!"
        + "\nDigite a sua idade: "); 
        age = entrada.nextInt();

        System.out.println("Estabeleça o limite de idade em que você quer se casar: "); 
        maxAge = entrada.nextInt(); // Idade máxima.

        System.out.println("Pense na menor idade que você se cogitaria subir no altar: ");
        minAge = entrada.nextInt(); // Idade mínima.

        calculate = (int) ((((maxAge - minAge) * 0.368) + minAge));

        System.out.println("A idade ideal para se casar é " + calculo);

        if (calculate == age){
            System.out.print("Já pode comprar o anel e preparar do discurso!");
        }else if (calculate > age){
            System.out.print("Ainda está cedo!");
        } else{
            System.out.print("Já passou da época!");
        }
    }
}
