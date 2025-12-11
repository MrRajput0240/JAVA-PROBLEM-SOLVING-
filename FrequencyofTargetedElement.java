package com.array_programs;
import java.util.Scanner;

public class FrequencyofTargetedElement {

    // Method to find frequency of target element
    public static int countFrequency(int[] a, int target) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count++;
            }
        }
        return count;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Take array elements as input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Ask user for target element
        System.out.print("Enter the element to find frequency of: ");
        int target = sc.nextInt();

        // Call method and print result
        int result = countFrequency(a, target);
        System.out.println("Frequency of element " + target + " = " + result);

        sc.close();
    }
}
