package com.javarush.task.collections;

import java.util.ArrayList;
import java.util.Collections;

/* 
Изучаем методы класса Collections, часть 2
*/

public class MethodsPartTwo {

    private static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    private static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    private static void rotate(ArrayList<Integer> list, int distance) {
        Collections.rotate(list, distance);
    }

    private static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }
}
