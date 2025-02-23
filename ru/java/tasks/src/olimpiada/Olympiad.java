package ru.java.tasks.src.olimpiada;

import java.util.Arrays;

public class Olympiad {

    private static final int MAX_TIME_FOR_SOLVE_TASKS = 300;

    public static Student getWinner(int[] tasks) {
        return getWinnerByTime(new OlimpiadResult[]{
                countSolvedTasksFor1(tasks),
                countSolvedTasksFor3(tasks),
                countSolvedTasksFor5(tasks)
        });
    }

    private static Student getWinnerByTime(OlimpiadResult[] olimpiadResults) {
        Student winner = olimpiadResults[0].getStudent();
        OlimpiadResult winnerOlimpiadResult = olimpiadResults[0];

        for (int i = 1; i < olimpiadResults.length; i++) {
            if (winnerOlimpiadResult.getCountSolvedTasks() > olimpiadResults[i].getCountSolvedTasks()) {
                winner = olimpiadResults[i].getStudent();
                winnerOlimpiadResult = olimpiadResults[i];
            } else if (winnerOlimpiadResult.getCountSolvedTasks() == olimpiadResults[i].getCountSolvedTasks()) {
                winnerOlimpiadResult = getWinnerResultByPenalty(winnerOlimpiadResult, olimpiadResults[i]);
                winner = winnerOlimpiadResult.getStudent();
            }
        }

        return winner;
    }

    private static OlimpiadResult getWinnerResultByPenalty(OlimpiadResult firstResult, OlimpiadResult secondResult) {
        if (firstResult.getPenalty() > secondResult.getPenalty()) {
            return firstResult;
        } else if (firstResult.getPenalty() < secondResult.getPenalty()) {
            return secondResult;
        } else {
            return getWinnerByCourse(firstResult, secondResult);
        }
    }

    private static OlimpiadResult getWinnerByCourse(OlimpiadResult firstResult, OlimpiadResult secondResult) {
        return firstResult.getStudent().getCourse() > secondResult.getStudent().getCourse() ?
                firstResult : secondResult;
    }

    private static OlimpiadResult countSolvedTasksFor5(int[] tasks) {
        int countTime = 0, countSolvedTasks = 0, penalty = 0, prevPenalty = 0;

        for (int task : tasks) {
            countTime += task + penalty;
            penalty = task + prevPenalty;
            prevPenalty = penalty;

            if (countTime >= MAX_TIME_FOR_SOLVE_TASKS) {
                break;
            }
            countSolvedTasks++;
        }

        return new OlimpiadResult(Student.FIFTH_YEAR_STUDENT, countSolvedTasks, penalty);
    }

    public static void main(String[] args) {
        int[] tasks = new int[]{30, 60, 60};
        System.out.println(countSolvedTasksFor3(tasks).getCountSolvedTasks());
    }

    private static OlimpiadResult countSolvedTasksFor3(int[] tasks) {
        int countTime = 0, countSolvedTasks = 0, penalty = 0, prevPenalty = 0;

        for (int i = tasks.length - 1; i >= 0; i--) {
            countTime += tasks[i] + penalty;
            penalty = tasks[i] + prevPenalty;
            prevPenalty = penalty;

            if (countTime >= MAX_TIME_FOR_SOLVE_TASKS) {
                break;
            }
            countSolvedTasks++;
        }

        return new OlimpiadResult(Student.THIRD_YEAR_STUDENT, countSolvedTasks, penalty);
    }

    private static OlimpiadResult countSolvedTasksFor1(int[] tasks) {
        Arrays.sort(tasks);
        OlimpiadResult olimpiadResult = countSolvedTasksFor5(tasks);
        olimpiadResult.setStudent(Student.FRESHMAN);
        return olimpiadResult;
    }
}
