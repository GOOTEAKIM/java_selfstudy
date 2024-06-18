package chap5.pack;

import chap5.pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        chap5.pack.b.User userB = new chap5.pack.b.User();
    }
}
