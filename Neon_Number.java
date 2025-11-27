package  com.number_program;

import java.util.Scanner;

public class Neon_Number{ 

    public static int square(int num){
        return num *num ;
    }
    public static void main(String[] args) {
        int square =square(num),sum=0;
        while (square !=0){
            sum =(square%10);
            square /=10 ;
        }
        return num == sum?"a NeonNumber":"not a Neon number ";
         }
         Public static void main (String[]args){
         scanner sc=new Scanner(system.in);
         system.out.println("provide the number :");
         int num= sc.nextInt();
         String result = checkneon (num);
         system.out.println("num" is +result)

            
         }

    }
}