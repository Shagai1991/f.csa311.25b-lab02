package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height; // private болгоно
    private double width; // private болгоно
    
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
