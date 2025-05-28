package tasks.ReverseReset;

public class Solution {
    private static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    private static String reverseString(String string) {
        builder.setLength(0);
        builder.append(string);
        builder.reverse();
        String result = builder.toString();
        return result;
    }
}
