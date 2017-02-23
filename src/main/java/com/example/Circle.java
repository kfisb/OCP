package com.example;

public class Circle implements IShape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double computeArea() {
        return radius * radius * Math.PI;
    }
}