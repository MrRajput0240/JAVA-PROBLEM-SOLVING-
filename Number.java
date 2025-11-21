package com.numberprograms;

import java.util.Scanner;

public class Number {

    // Method to check if number is positive, negative, or zero
    public static String checkNumber(double number) {
        if (number > 0)
            return "Positive";
        else if (number < 0)
            return "Negative";
        else
            return "Zero";
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Provide the number: ");
        double number = scanner.nextDouble();

        System.out.println(checkNumber(number));

        scanner.close();
    }
}