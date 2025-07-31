package org.example.day3;

public class Inher1ScienCalculator extends Inher1Calculator{

    //super class, extend, inheritance

    private int operand3;

    public  Inher1ScienCalculator(){
        // default constructor
    }

    public Inher1ScienCalculator(int operand1, int operand2, int operand3) {
        super(operand1, operand2);
        // call the super class construcor while inheriting


        // ----------------------IMP--------------------
        // always super call should be the first statement in the constructor  - Rule hai
        this.operand3 = operand3;
        System.out.println("Parameterized constructor - ScientificCalcualtor");
    }

    public int getOperand3() {
        return operand3;
    }

    public void setOperand3(int operand3) {
        this.operand3 = operand3;
    }

    public double sqrt(int operand3){
        return Math.sqrt(operand3);
    }

    public int add(){
        return getOperand1() + getOperand2() + operand3;
    }

}

/*
 'extends' is used for inheritance;
 'super' accesses parent class methods/constructors.
  Inheritance promotes code reuse and overriding.

  🔹 What is Inheritance?
     Inheritance allows a class (child/subclass) to acquire properties and behaviors(fields and methods)
      of another class (parent/superclass).

  🔹 Keyword: super
    Used to refer to the parent class:
    Call parent class constructor
    Access parent class method or variable

    */



/*

   class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {   --------------------extend (IMP)---------------------------
    Dog() {
        super(); // calls Animal constructor ----------- IMP--------------------
        System.out.println("Dog constructor");
    }

    void sound() {
        super.sound(); // calls Animal's sound method
        System.out.println("Dog barks");
    }
}


 */
