package tasks.circles2in1;

public class Ex6MiltiplicationTab {
    public static void main(String[] args) {
        multiTable();
    }

    private static void multiTable(){
        int result = 1;
        for (int external = 1; external <= 10; external++) {
            System.out.println();
            for (int internal = 1; internal <= 10; internal++) {
                result = external * internal;
                System.out.print(result + " ");
            }
        }
    }
}
