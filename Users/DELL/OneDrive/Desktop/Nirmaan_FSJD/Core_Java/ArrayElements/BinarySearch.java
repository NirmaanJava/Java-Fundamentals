package ArrayElements;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 10, 2, 3, 4, 11, 23, 34 };

		Arrays.sort(a);

		System.out.println("Sorted array: " + Arrays.toString(a));

		int key = 11;
		int index = Arrays.binarySearch(a, key);

		if (index >= 0) {
			System.out.println("Element " + key + " found at index: " + index);
		} else {
			System.out.println("Element " + key + " not found");
		}
	}
}
