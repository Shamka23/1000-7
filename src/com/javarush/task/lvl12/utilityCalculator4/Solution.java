package com.javarush.task.lvl12.utilityCalculator4;

public class Solution {
    private static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calculator.add(a, b);
        Calculator.subtract(a, b);
        Calculator.multiply(a, b);
        Calculator.divide(a, b);
    }

    private static class Calculator{

        private static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        private static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        private static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        private static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}
