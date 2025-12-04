package com.number_program;
import java.util.Scanner;

public class HCFNUMBER {

    // Method to find HCF of two numbers
    public static int highestCommonFactor(int num1, int num2) {
        int range = (num1 <= num2) ? num1 : num2;
        int max = 1;

        for (int i = 1; i <= range; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide the 1st number: ");
        int num1 = sc.nextInt();

        System.out.println("Provide the 2nd number: ");
        int num2 = sc.nextInt();

        int hcf = highestCommonFactor(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
