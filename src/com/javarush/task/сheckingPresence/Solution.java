package com.javarush.task.сheckingPresence;

import java.util.HashSet;
import java.util.List;

import static java.util.Arrays.asList;

public class Solution {
    private static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
    private static String[] searchingWords = {"Яблоко", "Грейпфрут", "Ананас"};
    private static HashSet<String> hashSetWhichNecessaryToFindSearchingWords = new HashSet<>(List.of("Суетолог копал и нашёл клад 3 арбуза 1 Яблоко Грейпфрут и Ананас".split(" ")));


    private static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }
    }

    private static boolean containsArray(String[] array, HashSet<String> hashSet) {
        hashSet.containsAll(asList(array));
        int count = 0;
        for (String element : array) {
            if (hashSet.contains(element)) {
                count++;
            }
        }
        return count == array.length;
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
        boolean resultArrayToHashMove = containsArray(searchingWords, hashSetWhichNecessaryToFindSearchingWords);
        System.out.println(resultArrayToHashMove);
    }
}
