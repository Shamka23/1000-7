package TechCharacteristicsEarth;


public class Solution {
    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.setName("Земля");
        earth.setAge(4_540_000_000L);
        earth.setSpeed(170_218);
        earth.setArea(510_072_000);
        earth.printInformation();

        Planet mars = new Planet();
        mars.setName("Mars");
        mars.setAge(4_503_000_000L);
        mars.setSpeed(86_677);
        mars.setArea(144_000_000);
        mars.printInformation();
    }
}
