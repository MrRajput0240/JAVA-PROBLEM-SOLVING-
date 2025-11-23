
import java.util.Scanner;

public class Alternate_Evennumber {

    // Method to print alternate even numbers
    public static void printAlternateEvenNumbers(int start, int end) {
        System.out.println("The even numbers are as follows:");
        int count = 1;

        if (start != 0 || end != 0) {
            for (int i = start; i <= end; i++) {
                if (i == 0) {
                    System.out.println("The number is 0");
                    continue;
                }

                if (i % 2 == 0) {
                    if (count % 2 == 0) {
                        count++;
                        continue;
                    } else {
                        System.out.println(i);
                        count++;
                    }
                }
            }
        } else {
            System.out.println("The number is neither \"even\" nor \"odd\"");
        }
    }

    // Main method to take input and call the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide the starting range: ");
        int start = sc.nextInt();

        System.out.print("Provide the ending range: ");
        int end = sc.nextInt();

        printAlternateEvenNumbers(start, end);
    }
}
