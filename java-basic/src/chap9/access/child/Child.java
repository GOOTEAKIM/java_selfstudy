package chap9.access.child;

import chap9.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        publicValue = 1;
        protectedValue = 1;

        publicMethod();
        protectedMethod();

        printParent();
    }
}
