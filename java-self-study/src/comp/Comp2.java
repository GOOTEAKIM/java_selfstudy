package comp;

public class Comp2 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello");
        System.out.println(result1);

        boolean result2 = str1.equals("문자열1");
        System.out.println(result2);

        boolean result3 = str1.equals("문자열3");
        System.out.println(result3);
    }
}
