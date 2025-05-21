package tasks.Arrays;

public class Ex3Palindrome {
    public static void main(String[] args) {
        int[] array = {3,2,1,2,3};
        boolean isPalindrome = toDoPalindrome(array);
        System.out.println(isPalindrome);
    }

    private static boolean toDoPalindrome(int[] arrayNumbers)  {
        for (int i = 0; i < arrayNumbers.length / 2; i++) {
            if (arrayNumbers[i] != arrayNumbers[arrayNumbers.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}