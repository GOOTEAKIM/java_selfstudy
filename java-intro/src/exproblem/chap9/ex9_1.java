package exproblem.chap9;

public class ex9_1 {
    public static void main(String[] args) {
        System.out.println(average(1,2,3));
        System.out.println(average(15, 25, 35));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return (double)sum / 3;
    }
}
