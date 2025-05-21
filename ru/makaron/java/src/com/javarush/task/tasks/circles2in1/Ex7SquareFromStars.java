package com.javarush.task.tasks.circles2in1;

public class Ex7SquareFromStars {
    public static void main(String[] args) {
        squareCreator(5, 3);
    }
    private static void squareCreator(int width , int height) {

        for (int external = 1; external <= height; external++) {
            for (int internal = 1; internal < width; internal++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
