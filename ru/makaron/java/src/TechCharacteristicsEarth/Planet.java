package TechCharacteristicsEarth;

public class Planet {

    private String name;
    private long age;
    private int speed;
    private int area;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(long age){
        this.age = age;
    }
    public long getAge(){
        return age;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setArea(int area){
        this.area = area;
    }
    public int getArea(){
        return area;
    }

    public void printInformation() {
        System.out.println("Имя планеты: " + name + ".");
        System.out.println("Возраст: " + age + " лет.");
        System.out.println("Орбитальная скорость: " + speed + " км/ч.");
        System.out.println("Общая площадь: " + area + " кв. км.");
    }
}
