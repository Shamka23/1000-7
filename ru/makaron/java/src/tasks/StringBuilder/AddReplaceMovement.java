package tasks.StringBuilder;

public class AddReplaceMovement {
    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder builder = new StringBuilder(string);
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
        return builder;
    }

    public static StringBuilder replace(String base, String target, int start, int end) {
        StringBuilder builder = new StringBuilder(base);
        return builder.replace(start, end, target);
    }
}
