package LeetCode;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 371;
		int test = number;
		int result = 0;
		int digit = 0;

		while (test != 0) {
			digit = test % 10;
			System.out.println("Digit is " + digit);
			result += digit * digit * digit;
			System.out.println("Result is " + result);
			test = test / 10;
			System.out.println("Test " + test);
		}

		System.out.println(number == result);
	}
}
