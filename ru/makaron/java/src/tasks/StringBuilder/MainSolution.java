package tasks.StringBuilder;

public class MainSolution {
    public static void main(String[] args) {
        String string = "Учиться, учиться и еще раз учиться! ";

        System.out.println(AddReplaceMovement.addTo(string, new String[]{"Под ", "лежачий ", "камень ", "вода ", "не ", "течет"}));
        System.out.println(AddReplaceMovement.replace(string, ", ", 16, 27));
    }
}
