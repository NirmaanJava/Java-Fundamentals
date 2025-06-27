package ArrayElements;

public class ReverseTheArray {

	public static void main(String[] args) {
		int a[] = { 1, 3, 5, 7, 8, 0 };

		int length = a.length;

		for (int i = length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}

}
