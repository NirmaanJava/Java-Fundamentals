
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int result = 1;
		for (int num : a) {
			System.out.println(num);
			result *= num;
		}
		System.out.println(result);

	}

}
