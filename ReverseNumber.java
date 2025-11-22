package com.numberprograms;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;  // Extract last digit and add to reverse
            num = num / 10;             // Remove last digit
        }

        System.out.println("Reversed number: " + rev);
    }
}