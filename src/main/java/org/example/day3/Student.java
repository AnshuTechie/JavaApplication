package org.example.day3;

public class  Student extends Person{
    String   univerisity;

    public Student(String name, String univerisity) {
        super(name);
        this.univerisity = univerisity;
    }
    public void getName(){
        System.out.println("Name - Student");
    }
}
