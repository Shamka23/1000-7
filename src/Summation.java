package src;

import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        System.out.println("Введите два числа, не превышающие  1 000 000 000");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Первое число:");
        int numberA = scanner.nextInt();
        if (numberA > 1000000000) {
            System.out.println("Ошибка: Число больше 1 000 000 000");
            return;
        }

    }
}
