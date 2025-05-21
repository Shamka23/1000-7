package tasks.Arrays;

public class Ex5ArithmeticMean {
    public static void main(String[] args) {
        int[] array = {10, 20, 6, 8, 25};
        int mean = findMeanArithmetic(array);
        System.out.println(mean);
    }

    private static int findMeanArithmetic(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum / array.length;
    }
}
