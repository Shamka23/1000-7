package com.javarush.task.сheckingPresence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.Arrays.sort;

public class Solution {
    private static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
    private static String[] searchingWords = {"Яблоко", "Грейпфрут", "Ананас"};
    private static HashSet<String> hashSetWhichNecessaryToFindSearchingWords = new HashSet<>(List.of("Суетолог копал и нашёл клад: 3 арбуза, 1 Яблоко, Грейпфрут и Ананас".split(" ")));


    private static void checkWords(String word) {
        if (words.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }
    }

    private static Boolean arrayToHashSet0(String[] array, HashSet<String> hashSet) {
        for (String element : array) {
            if (hashSet.contains(element)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchingWords);
        System.out.println(words);
        System.out.println(hashSetWhichNecessaryToFindSearchingWords);;
        checkWords("JavaScript");
        checkWords("Java");
        boolean resultArrayToHashMove = arrayToHashSet0(searchingWords, hashSetWhichNecessaryToFindSearchingWords);
        System.out.println(resultArrayToHashMove);
    }
}
