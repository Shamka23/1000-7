package ru.java.tasks.src.olimpiada;

public enum Student {
    FIFTH_YEAR_STUDENT(5),
    THIRD_YEAR_STUDENT(3),
    FRESHMAN(1);

    private int course;

    Student(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                '}';
    }
}
