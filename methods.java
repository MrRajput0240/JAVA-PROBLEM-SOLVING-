package com.numberprograms;

public class Methods {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        // Print first element
        System.out.println("First element: " + a[0]);

        // Print full array using loop
        System.out.print("Array elements: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
