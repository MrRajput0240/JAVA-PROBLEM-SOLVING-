

public class LinearSearch {

    // Method to search for an element in the array
    public static boolean SearchElement(int a[], int target) {
        boolean check = false;

        // Loop through each element of the array
        for (int i = 0; i < a.length; i++) {
            if (target == a[i]) {
                check = true; // element found
                break; // stop loop once found
            }
        }

        return check;
    }

    public static void main(String[] args) {

        int a[] = {4, 12, 8, 10, 47, 26, 98}; // array of numbers
        int target = 40; // element to search

        // Call the method correctly using array 'a' (not args)
        if (SearchElement(a, target))
            System.out.println("Element is present");
        else
            System.out.println("Element is missing");
    }
}
