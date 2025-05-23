package tasks.StringBuilder;

import java.util.Arrays;

public class Solution {

    private static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    private static StringBuilder addTo(String string, String[] strings) {
        builder.append(string);
        builder.append(String.join(" ", strings));
        return builder;
    }

    private static StringBuilder replace(String stringToReplace, String forReplace, int start, int end) {
        builder.append(stringToReplace);
        builder.replace(start, end, forReplace);
        return builder;
    }
}
