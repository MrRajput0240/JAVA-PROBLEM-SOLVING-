import java.util.Scanner;
import java util.scanner;
class Harshad_Number {
    public  String checckHarshad(int num){
        if (num % sum of digits (num)==0)
        return "Harshad NUmber";
    }
     else
     return "not HarshadNumber";    
    public static void main(String[] args) {
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+num%10;
            num|=10;

        }
        return sum;

    }
    public static void main(string[] args) {
        Scanner sc=newScanner(system.in);
        System.out.println("enter a number");
        int num =sc.nextInt();
        System.out.println("check Harshad(num)");

    }

}