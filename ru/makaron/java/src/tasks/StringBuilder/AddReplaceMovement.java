package tasks.StringBuilder;

public class AddReplaceMovement {
    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
        return builder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder builder = new StringBuilder(string);
        builder.replace(start, end, str);
        return builder;
    }
}
