package chap8.for_each;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // 일반 for 문
//        for (int i = 0; i < numbers.length; i++) {
//            int number = numbers[i];
//            System.out.println(number);
//        }

        // for - each 문

        for (int number : numbers) {
            System.out.println(number);
        }

        // for - each 문 못 쓸때에는 index값 필요
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("결과는 " + numbers[i]);
//        }
    }
}
