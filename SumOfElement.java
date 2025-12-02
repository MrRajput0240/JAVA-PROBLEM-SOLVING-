public class SumOfElements {

    // Method to calculate sum of array elements
    public static int sum(int[] a) {
        int sum = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 55, 45};
        System.out.println("The sum is: " + sum(a));
    }
}
