package com.javarush.task.tasks.circles;

public class Ex4PalindromeChecker {
    public static void main(String[] args) {
        checkToPalindrome(12321);
    }


    private static void checkToPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не Палиндром");
        }


    }
}
