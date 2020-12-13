package com.ss.day4.junit;

public class Line {
    private double x0;
    private double y0;
    private double x1;
    private double y1;

    public Line(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getSlope() {
        if(x1==x0) {
            throw new ArithmeticException();
        }
        return (y1-y0)/(x1-x0);
    }

    public double getDistance() {
        return Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
    }
}
