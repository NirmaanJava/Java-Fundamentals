package ArrayExample;

public class LargestElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 9, 10 };

		int max = a[0];
		for (int data : a) {
			if (data > max) {
				max = data;
			}
		}

		System.out.println("The largest element is: " + max);
	}
}
