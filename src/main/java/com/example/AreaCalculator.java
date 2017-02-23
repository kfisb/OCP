package com.example;

public class AreaCalculator {
    public double Area(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            IShape myShape = (IShape)shape;
            area +=  myShape.computeArea();
        }

        return area;
    }

    public double Area(IShape[] shapes) {
        double area = 0;
        for (IShape shape : shapes) {
           area +=  shape.computeArea();
        }
        return area;
    }

}