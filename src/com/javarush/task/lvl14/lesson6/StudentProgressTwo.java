package com.javarush.task.lvl14.lesson6;

import java.util.HashMap;

public class StudentProgressTwo {
    private static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
    }

    private static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    private static void printStudents() {
        for (String name : grades.keySet()) {
            System.out.println(name);
        }
    }

    private static Double getAverageMark() {
        Double averageMark = 0.0;
        for (String name : grades.keySet()) {
            averageMark += grades.get(name);
        }
        return averageMark / grades.size();
    }
}
