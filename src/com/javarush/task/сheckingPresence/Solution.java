package com.javarush.task.сheckingPresence;

import java.util.HashSet;
import java.util.List;

import static java.util.Arrays.asList;

public class Solution {
    private static final String[] STRING_WORDS = "Суетолог копал и нашёл клад 3 арбуза 1 Яблоко Грейпфрут и Ананас".split(" ");
    private static final HashSet<String> WORDS = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
    private static final String[] SEARCHING_WORDS = {"Яблоко", "Грейпфрут", "Ананас"};
    private static final HashSet<String> HASH_SET_WHICH_NECESSARY_TO_FIND_SEARCHING_WORDS = new HashSet<>(List.of(STRING_WORDS));


    private static void checkWords(HashSet<String> wordSet, String word) {
        if (wordSet.contains(word)) {
            System.out.println("Слово " + word + " есть в множестве");
        } else {
            System.out.println("Слова " + word + " нет в множестве");
        }
    }

    private static boolean containsArray(String[] array, HashSet<String> hashSet) {
        int count = 0;
        for (String element : array) {
            if (hashSet.contains(element)) {
                count++;
            }
        }
        return count == array.length;
    }

    public static void main(String[] args) {
        checkWords(WORDS,"JavaScript");
        checkWords(WORDS,"Java");
        boolean resultArrayToHashMove = containsArray(SEARCHING_WORDS, HASH_SET_WHICH_NECESSARY_TO_FIND_SEARCHING_WORDS);
        System.out.println(resultArrayToHashMove);
    }
}
