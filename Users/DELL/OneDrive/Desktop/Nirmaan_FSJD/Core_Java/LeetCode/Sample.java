package LeetCode;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {


		int sum = 5;
		int b = 3;
		int c = 5;

		for (int j = 0; j < c; j++) {
			sum += (int) Math.pow(2, j) * b;
			System.out.println(sum + " ");

		}
	}

}
