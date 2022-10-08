public class Divisor11Remainder5 {

    public static void main(String[] args){

        int counter = 1000, counter2 = 1;

        while(counter <= 1999){
            System.out.println("Contagem: " + counter);
            if (counter % 11 == 5) {
                System.out.println("Numero divisível por 11: " + counter);
                counter2++;
            }
            counter++;

            if(counter == 2000){
                System.out.println("A quantidade de numeros divisíveis por 11 = " + counter2);
            }
        }
    }
}