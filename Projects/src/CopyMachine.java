import java.util.Scanner;

public class CopyMachine {
    public static void main(String[] args){
        float xerox = 0.50f, studentDiscount = 0.20f;
        char answer;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("-------------------Lan house----------------");
        System.out.println("Valor do desconto estudante(pu): " + "R$"+ studentDiscount);
        System.out.println("Valor da xerox(pu): R$" + xerox);
        System.out.println("Valor da xerox(pu): com desconto: R$" + (xerox - studentDiscount));
        System.out.println("Valor de 100 unidades: R$" + (xerox*100));
        System.out.println("Valor de 100 com desconto: R$" + (xerox*100 - studentDiscount * 100));
        System.out.println("--------------------------------------------");

        System.out.println("Deseja ver uma tabela 1u/100u ?  S/N: ");
        answer = keyboard.next().charAt(0);

        char s = 's', S = 'S';
        int counter = 0;
        if (answer == s || answer == S){
            while (counter <= 100) {
                System.out.println("Quantidade:" + counter + " = R$" + xerox * counter);
                System.out.println("Quantidade(com desconto):" + counter + " = R$" + (xerox * counter - studentDiscount * counter));
                counter ++;
            }
        }
        keyboard.close();
    }
}