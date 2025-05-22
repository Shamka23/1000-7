package RobotPresentation;

public class Robot {
    private static int robotCounter;
    private int id;
    private int productionYear;
    private String model;
    public static final String VENDOR = "Javarush Co.";

    public Robot(String model, int productionYear) {
        this.model = model;
        this.productionYear = productionYear;
        this.id = ++robotCounter;
    }

    public void displayInformation() {
        System.out.printf("Я %d-й из %d роботов. Модель: %s. Произведен компанией %s в %d году.\n",
                getID(), robotCounter, getModel(), VENDOR, getProductionYear());
    }
    public void setID(int id) {
        this.id = id;
    }
    public int getID() {
        return id;
    }
    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
}
