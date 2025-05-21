package com.javarush.task.tasks.povtor;

public class Triangle {
    public static void main(String[] args) {
        createTriangle(5);
    }
    private static void createTriangle(int number) {
        for (int strings = 1; strings <= number; strings++) {
            for (int columns = 1; columns <= strings; columns++) {
                System.out.print(columns + " ");
            }
            System.out.println();
        }
    }
}
