package com.javarush.task.tasks.circles2in1;

public class Ex9PyramidOfStars {
    public static void main(String[] args) {
        createPyramid(5);
    }

    private static void createPyramid(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
