package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculateCircleArea(double radius){
        return Math.PI * radius * radius;
    }
    public static double calculateTriangleArea(double base, double height){
        return (0.5) * base * height;
    }
    public static double calculateRectangleArea(double length, double width){
        return (double) length * width;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("=== Area Calculator ===\n1. Circle\n2. Triangle\n3. Rectangle\nChoose a shape (1–3): ");
        int userChoice = scanner.nextInt();
        switch (userChoice){
            case 1:{
                System.out.print("Enter the radius: ");
                int radius = scanner.nextInt();
                double circleArea = calculateCircleArea(radius);
                System.out.print("Area of the circle: " + String.format("%.2f", circleArea));
                break;
            }
            case 2:{
                System.out.print("Enter the base: ");
                int base = scanner.nextInt();
                System.out.print("Enter the height: ");
                int height = scanner.nextInt();
                double triangleArea = calculateTriangleArea(base, height);
                System.out.print("Area of the triangle: " + String.format("%.2f", triangleArea));
                break;
            }
            case 3:{
                System.out.print("Enter the length: ");
                int length = scanner.nextInt();
                System.out.print("Enter the width: ");
                int width = scanner.nextInt();
                double rectangleArea = calculateRectangleArea(length, width);
                System.out.print("Area of the rectangle: " + String.format("%.2f", (float) rectangleArea));
                break;
            }
            default:
                System.out.println("Enter a valid choice!");
                break;
        }
    }
}