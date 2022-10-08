public class CounterLap1 {
    public static void main(String[] args){

        int counter = 1, counter2 = 2;

        while(counter <= 100 && counter2 <= 68) {

            int sum = counter + counter2;
            System.out.println(counter);
            System.out.println(counter2);
            System.out.println("Soma = " + sum);
            counter += 3;
            counter2 +=2;
        }
    }
}