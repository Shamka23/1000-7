package src;


public class NotDeafPhone {
    public static void infoOutput(int inputNumber){
        while (true) {
            if (inputNumber > 100 || inputNumber < 1) {
                System.out.println("Числа не в том диапазоне. Попробуйте от 1 до 100");
            } else {
                System.out.println(inputNumber);
            }
            break;
        }
    }
}
