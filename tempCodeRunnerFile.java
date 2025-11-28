import java.util.Scanner;

class Harshad_Number {

    // Method to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    // Method to check Harshad number
    public static String checkHarshad(int num) {
        int sum = sumOfDigits(num);
        if (num % sum == 0)
            return "Harshad Number";
        else
            return "Not a Harshad Number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println(checkHarshad(num));
        sc.close();
    }
}
