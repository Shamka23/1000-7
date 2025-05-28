package tasks.unicode;

public class Unicode {

    private static char[] values = {64, 74, 97, 118, 97, 82, 117, 115, 104};


    public static void main(String[] args) {
        char[] symbols = new char[9];
        initArraySymbols(symbols);
        System.out.println(new String(symbols));
    }

    public static char[] initArraySymbols(char[] arraySymbols) {
        for (int i = 0; i < arraySymbols.length; i++) {
            arraySymbols[i] = values[i];
        }
        return arraySymbols;
    }
}
