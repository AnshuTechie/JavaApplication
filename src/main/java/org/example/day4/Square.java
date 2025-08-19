package org.example.day4;

public class Square extends Shape {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side*side;
    }

    @Override
    public double calCircumferenec() {
        return 4*side;
    }
}
