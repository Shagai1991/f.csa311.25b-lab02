package edu.cmu.cs.cs214.lab02.shapes;

public class circle implements Shape {
    private double radius; // private болгоно

    public circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
