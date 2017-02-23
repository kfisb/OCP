package com.example;

public class EquilateralTriangle implements IShape2 {
    private double side;

    public EquilateralTriangle(double side) {
        this.side = side;
    }


    public double computeArea() {
        return (Math.sqrt(3)/4)*(side * side);
    }

    public double computePerimeter() {
        return side * 3;
    }
}
