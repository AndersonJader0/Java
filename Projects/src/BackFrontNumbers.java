import java.util.Arrays;
import java.util.Scanner;

public class BackFrontNumbers {

    public static void main(String[] args) {
        int tamanhoVetor = 5;
        Scanner scan = new Scanner(System.in);
        int[] original = new int[tamanhoVetor];
        int[] inverso = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("Digite um número:");
            original[i] = scan.nextInt();
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            inverso[i] = original[tamanhoVetor - 1 - i];
        }
        System.out.println("Os valores invertidos foram " + Arrays.toString(inverso));
    }
}
