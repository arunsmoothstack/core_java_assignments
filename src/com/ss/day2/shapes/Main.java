package com.ss.day2.shapes;

import java.util.concurrent.TransferQueue;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape triangle = new Triangle(5,4);
        Shape rectangle = new Rectangle(10, 4);
        circle.display();
        triangle.display();
        rectangle.display();
    }
}
