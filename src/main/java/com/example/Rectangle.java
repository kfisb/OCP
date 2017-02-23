package com.example;

public class Rectangle implements IShape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double computeArea() {
        return width * height;
    }
}