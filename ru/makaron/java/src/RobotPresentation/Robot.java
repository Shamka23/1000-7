package RobotPresentation;

public class Robot {
    private static int robotCounter;
    private int id;
    private int productionYear;
    private String model;
    public static String vendor = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                id, robotCounter, model, vendor, productionYear);
    }
}
