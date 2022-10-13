import java.util.Scanner;

public class LetterGame {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String word = keyboard.next();
        char[] letter = new char[word.length()];

        String myString = word;
        char[] myChars = myString.toCharArray();
        for (int i=0; i<myChars.length; i++){
            letter[i] = myChars[i];
            if(i == myChars.length){
                System.out.println("A palavra tem " + word.length() + "letras!");
            }
        }


        int letterPosition = 0;
        for (int i = 0; i < word.length(); i++) {
            letterPosition = i + 1;
            System.out.println("Soletre a " + letterPosition + "a letra da palavra: ");
            char wordLetter = keyboard.next().charAt(0);
            if (letter[i] == wordLetter) {
                System.out.println("Certa resposta!");
            } else{
                System.out.println("Resposta errada!");
            }

        }
    }
}