package com.ss.day2.shapes;

import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(5,4);
        Rectangle rectangle = new Rectangle(10, 4);
        circle.display();
        triangle.display();
        rectangle.display();
    }
}
