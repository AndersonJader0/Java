import java.util.Scanner;
import java.util.ArrayList;

public class PairNumbers {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float[] numbersDigited = new float[5];
        ArrayList<Integer> pairs = new ArrayList();

        int counter = 1;
        int counter2 = 1;
        int quantityPair = 1;
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("Digite o " + counter + "o número: ");
            float numbers = keyboard.nextInt();
            numbersDigited[i] = numbers;
            counter++;

            float calculatePair = numbersDigited[i] % 2;

            if (calculatePair == 0) {
                counter2++;
                quantityPair = counter2;
                pairs.add((int) numbersDigited[i]);
            }
            if (counter == 5) {
                System.out.println("Quantidade de números pares: " + quantityPair);
                System.out.println("Os números páres: " + quantityPair);
                int i2 = 0;
                for (i2 = 0; i < pairs.size(); i++) {
                    System.out.println(pairs.get(i));
                }
            }
        }
    }
}
