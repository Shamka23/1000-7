package com.javarush.task.lvl14forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* 
Переводим итератор в цикл for-each
*/

public class EteratorInForLoop {

    private static void printList(List<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void printHashSet(HashSet<String> words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        List<String> wordsList = Arrays.asList(wordsArray);
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
    }
}
