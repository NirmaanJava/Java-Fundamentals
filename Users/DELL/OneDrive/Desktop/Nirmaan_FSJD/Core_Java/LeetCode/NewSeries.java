package LeetCode;

import java.util.Scanner;

public class NewSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the  N number:");
		int N = s.nextInt();
		System.out.println("enter the A value");
		int a = s.nextInt();
		System.out.println("enter the B Value");
		int b = s.nextInt();
		System.out.println("eneter the c Value");
		int c = s.nextInt();
		for (int i = 0; i < N; i++) {

			int sum = a;
			for (int j = 0; j < c; j++) {
				sum += (int) Math.pow(2, j) * b;
				System.out.println(sum + " ");

			}
			System.out.println();

		}

		s.close();
	}

}
