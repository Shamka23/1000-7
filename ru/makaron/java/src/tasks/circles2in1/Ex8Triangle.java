package tasks.circles2in1;

public class Ex8Triangle {
    public static void main(String[] args) {
        createTriangle(5);
    }
    
    private static void createTriangle(int number) {

        for (int external = 1; external <= number; external++) {
            for (int internal = 1; internal <= external ; internal++) {
                System.out.print(internal + " ");
            }
            System.out.println();
        }
    }
}
