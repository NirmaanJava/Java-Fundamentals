package ArrayExample;

public class Reverse {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6 };

		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}

		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
