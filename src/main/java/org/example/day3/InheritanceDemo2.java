package org.example.day3;

public class InheritanceDemo2 {
    public static void main(String[] args) {
        C c = new C();
    }
}



class A {
    public A(){
        System.out.println("Constructor -A");
    }
}
class B extends  A {
    public B(){
        System.out.println("Constructor -B");
    }
}
class  C  extends B {
    public C(){
        System.out.println("Constructor -C");
    }
}

/*

When C c = new C(); is executed:
→ First, constructor of C is called.
→ Before running C's constructor, Java automatically calls B's constructor (its parent).
→ Before B's constructor runs, Java calls A's constructor (B’s parent).
This is called constructor chaining – starts from topmost parent (A) to child (C).

Why super() is not written explicitly?
→ In Java, if you don’t write super(), Java adds it automatically.
→ It calls the no-argument constructor of the parent class by default.
→ So, constructor chaining still happens even without writing super() manually.


 */