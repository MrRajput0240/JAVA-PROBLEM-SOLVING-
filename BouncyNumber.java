
import java.util.Scanner;

public class BouncyNumber {

    public static String checkBouncy(int num) {
        boolean inc = false, dec = false;
        int last, prev;

        while (num > 9) {
            last = num % 10;
            num /= 10;
            prev = num % 10;

            if (last < prev)
                dec = true;
            else if (last > prev)
                inc = true;

            // If both are true, it’s already a Bouncy number
            if (inc && dec)
                break;
        }

        if (inc && dec)
            return "Bouncy Number";
        else
            return "Not Bouncy Number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide a number:");
        int num = sc.nextInt();
        System.out.println(checkBouncy(num));
        sc.close();
    }
}
