package exproblem.chap5;

public class ex5_5 {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                // print 는 출력해도 다음 라인으로 넘어가지 않는다.
            }
            System.out.println();

        }
    }
}
