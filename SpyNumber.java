class SpyNumber{
    public static void main(String[] args) {
        int sum=0;
        while(num!=0){
            int rem=num %10;
            sum=sum+rem;
            num/=10;
        }
        return sum;
    }
    public static  int product of digits(int num) {
        int prod =1;
        while(num!=0){
            int rem=num %10;
            prod =prod*rem;
            num=num/10;
        }
        return prod;
        
    }
    public static check SpyNumber(int num){
        if (sum of Digit(num)==product of digits(num))
        return"is Spy NUmber";
        else
        return  "is SpyNumber";

        }
        psvm
    }
}