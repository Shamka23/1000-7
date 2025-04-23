package tasks.StringTokenizer;
import java.util.StringTokenizer;

public class WorkWithTokens {
    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] tokens = new String[tokenizer.countTokens()];

        for (int i = 0; tokenizer.hasMoreTokens(); i++) {
            tokens[i] = tokenizer.nextToken();
        }
        return tokens;
    }
}
