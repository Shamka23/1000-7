package com.javarush.task.lvl12.konverter;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        try {
            Double fromStringToDouble = Double.parseDouble(string);
            int roundCount = (int) Math.round(fromStringToDouble);
            System.out.println(fromStringToDouble);
            System.out.println(roundCount);
        }catch (NumberFormatException e){
            System.out.println("Херню закинул, переделывай дядя, не уариант слово " + string + " сделать цифрой");
        }
    }
}
