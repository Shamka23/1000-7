package com.javarush.task.tasks.Arrays;

public class Ex2EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {526, 232, 213, 612, 785};
        int evenNumbers = muchEvenNumbers(numbers);
        System.out.println(evenNumbers);
    }

    private static int muchEvenNumbers(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }
}
