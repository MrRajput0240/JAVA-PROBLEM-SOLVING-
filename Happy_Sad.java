

import java.util.Scanner;

public class Happy_Sad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the number:");
        int num = sc.nextInt();

        if (num >= 0) {
            int sum = num;

            while (sum > 9) {
                int temp = sum;
                sum = 0;

                while (temp != 0) {
                    int rem = temp % 10;
                    sum += rem * rem;
                    temp /= 10;
                }
            }

            if (sum == 1) {
                System.out.println("Happy Number");
            } else {
                System.out.println("Sad Number");
            }
        } else {
            System.out.println("Please enter a positive number.");
        }

        sc.close();
    }
}
