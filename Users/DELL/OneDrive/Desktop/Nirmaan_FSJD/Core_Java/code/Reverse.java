package code;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 0;
		a[3] = 5;
		a[4] = 6;

		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {
					System.out.println(a[i] + "<" + a[j] + "true block  " + a[j]);
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} else if (a[i] > a[j]) {
					System.out.println("false block");
				}
			}
		}

		for (int a1 : a) {
			System.out.println(a1);
		}

	}

}
