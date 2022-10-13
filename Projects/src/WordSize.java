import java.util.Scanner;

public class WordSize {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String word = keyboard.next();
        System.out.println("Essa palavra tem: " + word.length() + " letras.");
        keyboard.close();
    }
}
