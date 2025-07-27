package org.example.day2;

public class CalMethodOverloading {
    public static void main(String[] args){
        Calculator cal = new Calculator();

        System.out.println("Sum of int and int is : " + cal.add(100,100));
        System.out.println("Sum of double and int is : " + cal.add(100.2,100));
        System.out.println("Sum of int and double is : " + cal.add(100,100.2));
        System.out.println("Sum of double and double is : " + cal.add(100.2,100.3));
        System.out.println("Sum of String and String is : " + cal.add("Anshu","-Kumari"));

    }
}

/*
// Method overloading allows multiple methods with the same name but different parameters.
// Benefits: improves code readability, reusability, and makes the program more flexible and clean.

 */
