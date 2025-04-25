package com.javarush.task.lvl12.konverter;

/* 
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        Double fromStringToDouble = Double.parseDouble(string);
        int roundCount = (int) Math.round(fromStringToDouble);
        System.out.println(roundCount);
    }
}
