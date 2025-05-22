package RobotPresentation;

/* 
Презентация роботов
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Презентация роботов произведенных компанией " + Robot.VENDOR);

        Robot robot1 = new Robot("RCV-322", 2019);
        robot1.setID(2);
        robot1.displayInformation();


        Robot robot2 = new Robot("JavaTron-008", 2017);
        robot2.setID(1);
        robot2.displayInformation();

        Robot robot3 = new Robot("BugDestroyer-007", 1998);
        robot3.setProductionYear(1990);
        robot3.displayInformation();

        Robot robot4 = new Robot("Gundam-14", 2004);
        robot4.setModel("Suetolog228");
        robot4.displayInformation();

        Robot robot5 = new Robot("Eve-2", 2012);
        robot5.setModel("Son of MacBook Pro");
        robot5.displayInformation();

    }
}
