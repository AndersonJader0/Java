import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String []args) {
        Scanner keyboard = new Scanner(System.in);
        int table;
        System.out.println("Qual tabuada deseja? 1/infinito");
        table = keyboard.nextInt();

        int counter = 0;
        while (counter <=10){
            System.out.println(table+" X "+counter+" = "+counter * table);
            counter ++;
        }
    }
}
