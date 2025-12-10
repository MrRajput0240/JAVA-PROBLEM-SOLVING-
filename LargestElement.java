package com.array_program;

public class LargestElement {

    // Method to find the maximum element in the array
    public static int maxElement(int[] a) {
        int max = a[0]; // assume first element is max

        // compare each element with current max
        for (int i = 1; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = {6, 7, 8, 4, 3, 2, 10, 0};

        // Correct way to call the method and print result
        System.out.println("Largest element is: " + maxElement(a));
    }
}
\
