package ru.java.tasks.src.olimpiada;

public class OlimpiadResult {

    private Student student;
    private int countSolvedTasks;
    private int penalty;

    public OlimpiadResult(Student student, int countSolvedTasks, int penalty) {
        this.student = student;
        this.countSolvedTasks = countSolvedTasks;
        this.penalty = penalty;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public int getCountSolvedTasks() {
        return countSolvedTasks;
    }

    public int getPenalty() {
        return penalty;
    }
}
