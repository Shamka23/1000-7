package tasks.StringBuilder;

public class Solution {

    private static StringBuilder builder;

    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    private static StringBuilder addTo(String string, String[] strings) {
        builder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
        return builder;
    }

    private static StringBuilder replace(String stringToReplace, String stringForReplace, int start, int end) {
        builder = new StringBuilder(stringToReplace);
        builder.replace(start, end, stringForReplace);
        return builder;
    }
}
