package src;

import java.util.Scanner;

public class NotDeafPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 1 || inputNumber >= 100){
            System.out.println("Числа не в том диапазоне, попробуй от 1 до 100");
        } else {
            System.out.println(inputNumber);
        }
    }
}
