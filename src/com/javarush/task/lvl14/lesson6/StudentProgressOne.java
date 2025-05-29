package com.javarush.task.lvl14.lesson6;

import java.util.HashMap;

public class StudentProgressOne {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    private static void addStudents() {
        grades.put("Руперт Гнидовски", 1.0);
        grades.put("Суетолог Хыбыртовский", 2.0);
        grades.put("Гель Вишнёвый", 3.7);
        grades.put("Мусса-Хаджи Джёгетеевский", 5.0);
        grades.put("Рудольф Андерсон", 4.3);
    }
}
