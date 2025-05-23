package tasks.Arrays;

public class Ex1SumElement {
    public static void main(String[] args) {
        int[] inputValues = {10, 54, 82, 162, 4921};
        int[] valuesForChecking;

        try {
            valuesForChecking = new int[]{Integer.parseInt(null)};
        }catch (NumberFormatException e){
            valuesForChecking = new int[0];
        }

        int maxValue = getMaxValue(valuesForChecking);
        System.out.println(maxValue);
    }

    private static int getMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int result = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }

        int max = Integer.MIN_VALUE;
        for (int number : array) {
            max = Math.max(max, number);
        }
        return max;
    }
}
