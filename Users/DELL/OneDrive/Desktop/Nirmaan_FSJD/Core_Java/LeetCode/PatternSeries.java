package LeetCode;

import java.util.Scanner;

public class PatternSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the a Value:");
		int a = sc.nextInt();
		System.out.println("enter the B Value:");
		int b = sc.nextInt();
		System.out.println("enter the N Value:");
		int n = sc.nextInt();
		int result = 0;

		for (int i = 0; i < n; i++) {

			result = a + (int) Math.pow(b, i) * b;
			System.out.println(result);
		}
	}

}
