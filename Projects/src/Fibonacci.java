public class Fibonacci {

    public static void main(String[] args) {

        int[] fibonacci = new int [10];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i <= 9; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        System.out.println("Esta é a sequência de Fibonacci!");
        for (int value : fibonacci) {
            System.out.print(value + " ");
        }
    }
}
