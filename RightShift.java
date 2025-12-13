import java.util.Arrays;

public class RightShift {
    public static int[] rightShift(int[] a) {
        int temp = a[a.length - 1];  // Store last element
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];         // Shift elements to the right
        }
        a[0] = temp;                 // Move last element to first position
        return a;
    }

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("Before Right Shift: " + Arrays.toString(a));
        a = rightShift(a);
        System.out.println("After Right Shift: " + Arrays.toString(a));
    }
}
