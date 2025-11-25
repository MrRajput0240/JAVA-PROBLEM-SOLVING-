import java.util.Scanner;

public class Prime_Composite {

    public static void factorsOfNumber(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime Number");
        } else if (count > 2) {
            System.out.println(num + " is a Composite Number");
        } else {
            System.out.println("The number is neither Prime nor Composite: " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the number: ");
        int num = sc.nextInt();

        factorsOfNumber(num);
    }
}