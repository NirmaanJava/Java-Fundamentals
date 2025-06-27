package ArrayExample;

public class SumOfElement {

	public static void main(String[] args) {
		int result = 0;
		int[] data = { 100, 20, 30, 30, 20 };

		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}
		System.out.println(result);

	}

}
