package LeetCode;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1234;
		int data;
		int local = 1;

		while (number != 0) {
			data = number % 10;
			local = local * 10 + data;
			number = number / 10;
			System.out.println(local);
			break;
		}

	}

}
