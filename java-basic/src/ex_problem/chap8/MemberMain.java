package ex_problem.chap8;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "kim");

        member.print();
        member.changeData("myId2", "seo");
        member.print();
    }
}
