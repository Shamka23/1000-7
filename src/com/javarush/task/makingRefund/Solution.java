package com.javarush.task.makingRefund;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (String elements : array) {
            System.out.println(elements);
        }

        System.out.println("__________________________________");

        HashSet<String> hashSet0 = arrayToHashSet0(array);
        for (String elements : hashSet0) {
            System.out.println(elements);
        }

        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String elements : hashSet) {
            System.out.println(elements);
        }

        System.out.println("___________________________________");

        HashSet<String> hashSet2 = arrayToHashSet1(array);
        for (String elements : hashSet2) {
            System.out.println(elements);
        }

        System.out.println("___________________________________");

        HashSet<String> hashSet3 = arrayToHashSet3(array);
        for (String elements : hashSet3) {
            System.out.println(elements);
        }

    }

    public static HashSet<String> arrayToHashSet0(String[] strings) {
        HashSet<String> hashSet = new HashSet<>();
        for (String string : strings) {
            hashSet.add(string);
        }
        return hashSet;
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, strings);
        return hashSet;
    }

    public static HashSet<String> arrayToHashSet1(String[] strings) {
        return new HashSet<>(Arrays.asList(strings));
    }

    public static HashSet<String> arrayToHashSet3(String[] strings) {
        return (Arrays.stream(strings).collect(Collectors.toCollection(HashSet::new)));
    }
}