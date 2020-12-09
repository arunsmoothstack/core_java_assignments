package com.ss.day2.shapes;

public class Triangle implements Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return .5*base*height;
    }

    @Override
    public void display() {
        System.out.println("Area of the triangle is: " + calculateArea());
    }

}
