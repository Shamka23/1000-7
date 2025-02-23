package src;

public class SameColors {
    public static int minNumberBeadOneColor(int numberOfColors) {
        if (numberOfColors < 1 || numberOfColors > 1000000000) {
            return 0;
        } else {
            return numberOfColors + 1;
        }
    }
}
