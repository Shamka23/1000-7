package com.javarush.task.tasks.circles;

public class Ex5Factorial {
    public static void main(String[] args) {
        System.out.println(foundFactorial(-5));
    }

    private static long foundFactorial(long number) {
        long result = 1;

        if (number < 1) {
          return number;
        }

        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
