package com.javarush.task.task01.task0107;

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
