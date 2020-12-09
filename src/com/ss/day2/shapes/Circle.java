package com.ss.day2.shapes;

/**
 * @author Arun Mavumkal
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public void display() {
        System.out.println("Area of Circle is: " + calculateArea());
    }
}
