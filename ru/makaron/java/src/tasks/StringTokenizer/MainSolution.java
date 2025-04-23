package tasks.StringTokenizer;

import java.util.Arrays;

public class MainSolution {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = WorkWithTokens.getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }
}
