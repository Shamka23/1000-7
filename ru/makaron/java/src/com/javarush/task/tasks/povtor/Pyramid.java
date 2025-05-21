package com.javarush.task.tasks.povtor;

public class Pyramid {
    public static void main(String[] args) {
        createPyramid(5);
    }
    
    private static void createPyramid(int maxStrings) {
        for (int strings = 1; strings <= maxStrings; strings++) {
            for (int columns = 0; columns < maxStrings - strings; columns++) {
                System.out.print(" ");
            }

            for (int whiteSpaces = 0; whiteSpaces < 2 * strings - 1; whiteSpaces++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
