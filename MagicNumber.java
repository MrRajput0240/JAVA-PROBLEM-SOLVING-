import java.util.Scanner;

class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the number: ");
        int num = sc.nextInt();

        // Calling method
        System.out.println(checkMagic(num));
    }

    // Method to check if number is magic or not
    public static String checkMagic(int num) {
        int sum = num;

        // Repeat until we get a single-digit number
        while (sum > 9) {
            int temp = sum;
            sum = 0;

            // Add digits of temp
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }
