package com.ss.day2.shapes;

public class Rectangle implements Shape{
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void display() {
        System.out.println("Area of Rectangle is: " + calculateArea());
    }
}
