package LeetCode;

import java.util.Scanner;

public class NumberIntoWord {

	public static String methodNamee(int number) {
		String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		String[] hints = { "ten", "eleven", "twelve", "thirtteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		int r1 = 0;
		int r2 = 0;
		String Result = "gg";
		if ((number >= 0) && (number <= 9)) {
			r1 = number % 10;
			return ones[r1];
		} else if ((number >= 10) && (number <= 19)) {
			r1 = number % 10;
			return hints[r1];
		} else if ((number >= 20) && (number <= 99)) {
			r1 = number % 10;
			r2 = number / 10;
			return tens[r2] + " " + ones[r1];
		}
		return Result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range");
		int data = sc.nextInt();
		for (int i = 0; i <= data; i++) {
			System.out.println(methodNamee(i));
		}
	}

}
