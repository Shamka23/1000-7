package src;

public class Summation {
    public static long sumNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > 1000000000 && secondNumber > 1000000000) {
            System.out.println("Ошибка: число больше 1 000 000 000");
        } else {
            long resultSum = firstNumber + secondNumber;
            System.out.println(resultSum);
        }
        return 0;
    }
}

