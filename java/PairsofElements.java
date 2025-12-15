package com.array_programs;

public class PairsofElements {
    public static void printpairs(int[] a, int target) {
        // to target single elements
        for (int i = 0; i < a.length - 1; i++) {
            // to iterate the array
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target)
                    System.out.println("[" + a[i] + " " + a[j] + "]");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 35, 6, 8, 96};
        int target = 5;
        printpairs(a, target);
    }
}

