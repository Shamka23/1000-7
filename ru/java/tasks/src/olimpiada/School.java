package ru.java.tasks.src.olimpiada;

public class School {
    public static void main(String[] args) {
        int[] tasks = {30, 60, 60};
        Student winner = Olympiad.getWinner(tasks);
        System.out.println(winner.toString());
    }
}
