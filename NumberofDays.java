package com.numberprograms;

import java.util.Scanner;

public class NumberofDays {

    // Method to check leap year
    public static boolean checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to check month and return days
    public static String checkMonth(byte month, int year) {
        switch (month) {
            case 1:
                return "January : 31 days";
            case 2:
                if (checkLeapYear(year))
                    return "February : 29 days";
                else
                    return "February : 28 days";
            case 3:
                return "March : 31 days";
            case 4:
                return "April : 30 days";
            case 5:
                return "May : 31 days";
            case 6:
                return "June : 30 days";
            case 7:
                return "July : 31 days";
            case 8:
                return "August : 31 days";
            case 9:
                return "September : 30 days";
            case 10:
                return "October : 31 days";
            case 11:
                return "November : 30 days";
            case 12:
                return "December : 31 days";
            default:
                return "Invalid Month Number! Please enter between 1 to 12.";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the year: ");
        int year = sc.nextInt();

        System.out.print("Provide the month number (1-12): ");
        byte month = sc.nextByte();

        System.out.println(checkMonth(month, year));
        
        sc.close();
    }
}