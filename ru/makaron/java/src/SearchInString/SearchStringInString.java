package SearchInString;

public class SearchStringInString {

    private static final String STRING = "Чтобы стать программистом, нужно писать код. Чтобы писать код, нужно учиться. Чтобы учиться, нужно желание.";
    private static final String WORD = "код";

    public static void main(String[] args) {
        SearchStringInString searchString = new SearchStringInString();

        int firstIndex = searchString.getIndexFromFirstWord();
        int secondIndex = searchString.getIndexFromLastWord();

        System.out.println(firstIndex + "\n" + secondIndex);
    }

    public String getString(){
        return STRING;
    }

    public String getWord(){
        return WORD;
    }
    public int getIndexFromFirstWord() {
        return getString().indexOf(getWord());
    }


    public int getIndexFromLastWord() {
        return getString().lastIndexOf(getWord());
    }
}
