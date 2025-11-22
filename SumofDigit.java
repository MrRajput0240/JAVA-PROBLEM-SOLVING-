import java.util.Scanner;

public class SumOfDigit {

    // Method to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0, rem;
        while (num != 0) {
            rem = num % 10;     // Get last digit
            sum = sum + rem;    // Add it to sum
            num = num / 10;     // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        int sum = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}