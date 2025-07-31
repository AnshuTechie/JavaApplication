package org.example.day3;

public class InheritanceDemo3 {
    public static void main(String[] args) {

    }
}

class Person{
    String name;
    public Person(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println("Name - Person");
    }
}


class PersonFactory {

    public Person createPerson(){
        return new Person("Jerry");
    }
}


class  StudentFactory extends  PersonFactory{
    public Student createPerson(){
        return new Student("Jerry" ,"Harvard");
    }
}