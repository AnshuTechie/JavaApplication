package org.example.day4;

public class AbstractDemo1 {
    public static void main(String[] args){
        Circle circle = new Circle("red",5);
        Square sq = new Square("green",10);

        System.out.println("Color :" + circle.getColor() + "  and area of circle is :" + circle.calculateArea());

        System.out.println("Circle perimeter : " + circle.calCircumferenec());
        System.out.println("Square area :"+ sq.calculateArea() + "" );
    }
}
