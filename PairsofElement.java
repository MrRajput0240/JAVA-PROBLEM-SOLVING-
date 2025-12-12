package com.array_program;

public class PairsofElement {

    // Method to print all pairs of elements whose sum equals the target
    public static void PrintPairs(int[] a, int target) {
        // Loop through each element in the array
        for (int i = 0; i < a.length - 1; i++) {
            // Inner loop to check pairs with the current element
            for (int j = i + 1; j < a.length; j++) {
                // Check if the sum of the pair equals the target
                if (a[i] + a[j] == target) {
                    System.out.println("[" + a[i] + ", " + a[j] + "]");
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1, 5, 7, 0};
        int target = 5;

        System.out.println("Pairs whose sum is " + target + ":");
        PrintPairs(a, target);
    }
}
