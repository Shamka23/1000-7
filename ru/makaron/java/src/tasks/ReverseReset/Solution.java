package tasks.ReverseReset;

public class Solution {
    private static StringBuilder builder;

    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    private static String reverseString(String string) {
        builder = new StringBuilder(string);
        builder.reverse();
        String result = builder.toString();
        return result;
    }
}
