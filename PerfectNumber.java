import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide the number:");
        int num = sc.nextInt();
        System.out.println(checkPerfect(num));
        sc.close();
    }

    public static String checkPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }
        if (num == sum)
            return "Perfect Number";
        else
            return "Not a Perfect Number";
    }
}
