package ArrayExample;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 3 };
		boolean flag = true;
		System.out.println("Array after removing duplicates:");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					flag = false;
					break;

				} else {
					flag = true;
					continue;
				}

			}
			if (flag == true) {
				System.out.println(a[i]);
			}
		}
	}
}
