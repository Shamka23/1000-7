package tasks.circles;

public class Ex1SumNum {
    public static void main(String[] args) {
    sumNum(5);
    }
    private static void sumNum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
