import java.util.Arrays;

public class PairsofElement {

    public static int[] swap(int[] a, int index1, int index2) {
        if (index1 < 0 || index2 >= a.length) {
            System.out.println("Invalid Input");
        } else {
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 2, 1, 5, 7, 0};
        System.out.println("Before swap: " + Arrays.toString(a));

        int i1 = 2;  // index 2 -> element 2
        int i2 = 3;  // index 3 -> element 1

        int[] n = swap(a, i1, i2);
        System.out.println("After swap: " + Arrays.toString(n));
    }
}
