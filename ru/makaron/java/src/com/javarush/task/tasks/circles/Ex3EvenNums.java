package com.javarush.task.tasks.circles;

public class Ex3EvenNums {
    public static void main(String[] args) {
        EvenNums(100);
    }

    private static void EvenNums(int numToEven) {
        for (int i = 1; i <= numToEven ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
