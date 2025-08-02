package org.example.day4;

// mujhe aissa kb lgega ki is class ko mujhe abstract banana hai, ya mujhe isko static rakhna
// hai ya abstract banana hai ??????????????????????????????????????????????????????




/*
The main purpose of using an abstract class like Animal is to write cleaner, reusable, and more
 maintainable code that enforces a structure while allowing flexibility in implementation.

An abstract class is a class that cannot be instantiated (you cannot create its object directly).
An abstract method has no body and must be implemented in a subclass.
Used when we want partial abstraction.

-------How this example satisfies the definition---------
Animal is abstract, so we cannot create its object directly.
It has an abstract method sound() which is implemented by Dog class.
eat() is a concrete method to show that abstract classes can have normal methods too.
This demonstrates abstraction – the parent defines what to do (sound()), child defines how.

--------Why Use an Abstract Class Like Animal?
An abstract class is useful when:
You want to define a common structure or contract for all subclasses.
Some behaviors should be shared, while others must be provided by the child class.

🧠-------- Real-World Analogy
Imagine you're building a zoo management system. All animals can eat, but they make different sounds.
Animal gives you a blueprint: “Every animal must be able to sound() and can eat().”
Dog, Cat, Lion implement the sound() differently.

 */

abstract class Animal {
    abstract void sound();  // abstract method
    void eat() {            // concrete method
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstractdemo {
    public static void main(String[] args) {
        Animal obj = new Dog();  // upcasting
        obj.sound(); // Output: Dog barks
        obj.eat();   // Output: Animals can eat
    }
}
