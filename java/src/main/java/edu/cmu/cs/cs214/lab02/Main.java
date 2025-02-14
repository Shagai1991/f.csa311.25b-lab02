package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*; 
import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (
        Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select a shape to draw:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            int choice = scanner.nextInt();

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.println("Enter height and width of Rectangle:");
                    double height = scanner.nextDouble();
                    double width = scanner.nextDouble();
                    shape = new Rectangle(height, width);
                    break;
                case 2:
                    System.out.println("Enter radius of Circle:");
                    double radius = scanner.nextDouble();
                    shape = new circle(radius); 
                    break;
                case 3:
                    System.out.println("Enter side length of Square:");
                    double sideLen = scanner.nextDouble();
                    shape = new Square(sideLen); 
                    break;
                default:
                    System.out.println("Invalid choice. Exiting...");
                    return;
            }

            Renderer renderer = new Renderer(shape);
            renderer.draw();
        }
    }
}
