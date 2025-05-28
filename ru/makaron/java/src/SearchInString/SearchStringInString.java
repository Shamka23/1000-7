package SearchInString;

public class SearchStringInString {

    private static final String TARGETWORD = "код";
    private static final String INITIALSTRING = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";

    public static void main(String[] args) {
        int indexFromFirstWord = getIndexFromFirstWord(INITIALSTRING, TARGETWORD);
        int indexFromLastWord = getIndexFromLastWord(INITIALSTRING, TARGETWORD);

        System.out.println("Индекс первого символа первого слова \"" + TARGETWORD + "\" равен - " + indexFromFirstWord);
        System.out.println("Индекс первого символа последнего слова \"" + TARGETWORD + "\" равен - " + indexFromLastWord);
    }

    private static int getIndexFromFirstWord(String initialString, String targetWord) {
        return initialString.indexOf(targetWord);
    }

    private static int getIndexFromLastWord(String initialString, String targetWord) {
        return initialString.lastIndexOf(targetWord);
    }
}
