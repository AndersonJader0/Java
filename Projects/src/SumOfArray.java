public class SumOfArray {
    public static void main(String[] args) {
        int numbers[] = new int[] {12,34,45,21,33,4};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println("Sum of array numbers = "+sum);
    }
}
