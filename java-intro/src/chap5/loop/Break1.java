package chap5.loop;

public class Break1 {
    public static void main(String[] args) {
//        int i = 1;
//        int sum = 0;
//
//        while (sum <=10) {
//            sum += i;
//            i++;
//
//
//        }
//        System.out.println(sum);

        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println(sum);
                break;
            }
            i++;
        }
    }
}
