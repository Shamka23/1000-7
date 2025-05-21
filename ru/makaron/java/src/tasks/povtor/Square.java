package tasks.povtor;

public class Square {
    public static void main(String[] args) {
        createSquare(5, 3);
    }

    private static void createSquare(int width, int height) {
        for (int strings = 1; strings <= height ; strings++) {
            for (int columns = 1; columns <= width; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
