package SearchInString;

public class SearchStringInString {

    public static final String WORD = "код";
    public static final String STRING = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";

    public static void main(String[] args) {
        int indexFromFirstWord = getIndexFromFirstWord(STRING, WORD);
        int indexFromLastWord = getIndexFromLastWord(STRING, WORD);

        System.out.println("Индекс первого символа первого слова \"" + WORD + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + WORD + "\" равен - " + indexFromLastWord);
    }

    public static int getIndexFromFirstWord(String string, String word) {
        return string.indexOf(word);
    }

    public static int getIndexFromLastWord(String string, String word) {
        return string.lastIndexOf(word);
    }
}
