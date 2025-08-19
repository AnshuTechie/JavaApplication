package org.example.day4;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

//    public double circleArea(double radius){
//        return Math.PI*radius*radius;
//    }

//    public double circlePerimeter(double radius){
//        return 2*Math.PI*radius;
//    }



    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calCircumferenec() {
        return Math.PI*radius*radius;
    }
}
