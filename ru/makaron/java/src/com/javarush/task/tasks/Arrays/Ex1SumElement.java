package com.javarush.task.tasks.Arrays;

public class Ex1SumElement {
    public static void main(String[] args) {
        int[] elements = {10, 54, 82, 162, 4921};
        int[] elements2 = {};
        int maxValue = getMaxValue(elements2);
        System.out.println(maxValue);
    }

    private static int getMaxValue(int[] array) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }

        if (array == null || array.length == 0) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int number : array) {
            max = Math.max(max, number);
        }
        return max;
    }
}
