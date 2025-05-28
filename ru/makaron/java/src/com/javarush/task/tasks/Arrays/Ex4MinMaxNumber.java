package com.javarush.task.tasks.Arrays;

public class Ex4MinMaxNumber {
    public static void main(String[] args) {
        int[] array = {283612, 2342, 9283, 214742};
        int min = findMinNumber(array);
        System.out.println(min);

        int max = findMaxNumber(array);
        System.out.println(max);
    }

    private static int findMinNumber(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    private static int findMaxNumber(int[] array) {
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
