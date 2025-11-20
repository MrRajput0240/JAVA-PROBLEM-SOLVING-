package com.number_programs;

import java.util.Scanner;

public class Areas {

    // Method to calculate area of square
    public static double areaOfSquare(double side) {
        return side * side;
    }

    // Method to calculate area of rectangle
    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate sum of both areas
    public static double sumOfAreas(double rectangleArea, double squareArea) {
        return rectangleArea + squareArea;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the side of a square: ");
        double side = sc.nextDouble();

        System.out.print("Provide the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Provide the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double squareArea = areaOfSquare(side);
        double rectangleArea = areaOfRectangle(length, breadth);
        double totalArea = sumOfAreas(rectangleArea, squareArea);

        System.out.println("The sum of areas is: " + totalArea);
    }
}