package com.javarush.task.pro.task08.task0808;

/* 
Обратный отсчет
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        countDown();
    }
    private static void countDown() throws InterruptedException {
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                Thread.currentThread().interrupt();

                System.out.println("Накрылся твой взлёт, Юра");
                break;
            }
            System.out.println("Поехали");
        }
    }
}
