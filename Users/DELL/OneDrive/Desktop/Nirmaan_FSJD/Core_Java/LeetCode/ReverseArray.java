package LeetCode;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };
        int l = a.length;
        int[] b = new int[l];

        // Reverse a into b
        for (int i = l - 1, j = 0; i >= 0; i--, j++) {
            b[j] = a[i];
        }

        // Example: Print element at index 1 of reversed array
        System.out.println(b[0]);  // Output should be 5
    }
}
