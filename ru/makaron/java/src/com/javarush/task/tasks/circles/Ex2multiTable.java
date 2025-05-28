package com.javarush.task.tasks.circles;

public class Ex2multiTable {
    public static void main(String[] args) {
        multiTool(7);
    }

    private static void multiTool(int num) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
