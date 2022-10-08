import java.util.Scanner;

public class MarriageFormula {
    public static void main (String[] args){

        int age, maxAge, minAge, calculate;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Programa: Formula para se casar!"
                + "\nDigite a sua age: ");
        age = keyboard.nextInt();

        System.out.println("Estabeleça o limite de age em que você quer se casar: ");
        maxAge = keyboard.nextInt();

        System.out.println("Pense na menor age que você se cogitaria subir no altar: ");
        minAge = keyboard.nextInt();

        calculate = (int) ((((maxAge - minAge) * 0.368) + minAge));

        System.out.println("A age ideal para se casar é " + calculate);

        if (calculate == age){
            System.out.print("Já pode comprar o anel e preparar do discurso!");
        }else if (calculate > age){
            System.out.print("Ainda está cedo!");
        } else{
            System.out.print("Já passou da época!");
        }
    }
}
