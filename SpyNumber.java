import java.util.Scanner;

class SpyNumber {

    // Method to find sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    // Method to find product of digits
    public static int productOfDigits(int num) {
        int prod = 1;
        while (num != 0) {
            int rem = num % 10;
            prod *= rem;
            num /= 10;
        }
        return prod;
    }

    // Method to check if number is Spy number
    public static String checkSpyNumber(int num) {
        if (sumOfDigits(num) == productOfDigits(num))
            return "is a Spy Number";
        else
            return "is not a Spy Number";
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide a number: ");
        int num = sc.nextInt();

        System.out.println(num + " " + checkSpyNumber(num));
    }
}
