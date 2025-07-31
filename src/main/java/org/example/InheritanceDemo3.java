package org.example;

import org.example.day3.Student;

public class InheritanceDemo3 {
    public static void main(String[] args){
        Person person = new Person("ravi");
        person.getName();

    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
        System.out.println("Name - Person class");
    }

    public String getName() {
        return name;
    }
}


class student extends Person{

    String university;
    public student(String name, String university) {
        super(name);
        this.university = university;
        System.out.println(" This is student class which inherits super class person");
    }

    public String getUniversity() {
        return university;
    }

}

class PersonFactory{
    public Person createPerson(){
        return new Person("Tom");
    }
}

class studentFactory extends PersonFactory{
    public Student createStudent(){
        return new Student("Tom", "DAV University");
    }
}

