package com.javarush.task.lvl14forEachLoop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Выводим в консоли элементы множества
*/

public class ElmentsOfSet {

    private static String arraysToHash = "Программированию обычно учат на примерах.";

    private static void print(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList(arraysToHash.split(" ")));
        print(words);
    }
}
