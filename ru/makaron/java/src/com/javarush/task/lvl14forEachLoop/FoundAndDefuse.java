package com.javarush.task.lvl14forEachLoop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Найти и обезвредить
*/

public class FoundAndDefuse {

    public static void main(String[] args) {
        List<String> words = List.of(
                "Hello world!",
                "Amigo",
                "Elly",
                "Kerry",
                "Bug",
                "bug",
                "Easy ug",
                "Risha"
        );

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    private static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("bug")) {
                list.remove(i);
            }
        }
    }

    private static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase("bug")) {
                it.remove();
            }
        }
    }

    private static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> copy = new ArrayList<>(list);

        for (String word : copy) {
            if (word.equalsIgnoreCase("bug")) {
                list.remove(word);
            }
        }
    }
}
