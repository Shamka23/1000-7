package tasks.povtor;

public class MultiplicationTable {
    public static void main(String[] args) {
        createMultiTab();
    }
    
    private static void createMultiTab() {
        for (int strings = 1; strings <= 10; strings++) {
            for (int columns = 1; columns <= 10; columns++) {
                System.out.print(strings * columns + " ");
            }
            System.out.println();
        }
    }
}
