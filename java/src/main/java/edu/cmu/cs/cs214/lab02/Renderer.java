package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println("Shape printed:");
        
        if (shape instanceof Rectangle) {
            drawRectangle((Rectangle) shape);
        } else if (shape instanceof circle) {
            drawCircle((circle) shape);
        } else if (shape instanceof Square) {
            drawSquare((Square) shape);
        }

        System.out.println("Its area is: " + shape.getArea());
    }

    private void drawRectangle(Rectangle rectangle) {
        int height = (int) rectangle.getHeight();
        int width = (int) rectangle.getWidth();
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void drawSquare(Square square) {
        int side = (int) square.getSideLen();
        
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void drawCircle(circle circle) {
        int radius = (int) circle.getRadius();
        int diameter = radius * 2;
        
        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                int dx = i - radius;
                int dy = j - radius;
                if (dx * dx + dy * dy <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
