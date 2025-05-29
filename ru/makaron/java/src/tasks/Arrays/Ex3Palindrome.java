package tasks.Arrays;

public class Ex3Palindrome {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 2, 3};
        boolean isPalindrome = findPalindrome(array);
        System.out.println(isPalindrome);
    }

    private static boolean findPalindrome(int[] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length / 2; i++) {
            if (arrayNumbers[i] != arrayNumbers[arrayNumbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}