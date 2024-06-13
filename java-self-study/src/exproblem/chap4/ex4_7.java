package exproblem.chap4;

public class ex4_7 {
    public static void main(String[] args) {
        int x = 3;

        String result = (x % 2 == 0) ? "짝수":"홀수";
        //           위의 조건을 만족한다? 짝수, 아니다? 홀수
        System.out.println(x + " , "+ result);
    }
}
