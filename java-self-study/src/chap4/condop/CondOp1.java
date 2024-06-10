package chap4.condop;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 7;
        String status;
        if (age >= 18) {
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("나이 : " + age + " 상태 : " + status);
    }
}
