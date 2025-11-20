import java.util.Scanner;

public class LeapYear {

    // Method to check if a year is a leap year
    public static String checkLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return "Leap Year";
        } else {
            return "Not a Leap Year";
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.println(checkLeapYear(year));
    }
}