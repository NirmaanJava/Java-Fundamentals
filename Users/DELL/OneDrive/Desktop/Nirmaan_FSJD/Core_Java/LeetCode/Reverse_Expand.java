package LeetCode;

import java.util.Scanner;

public class Reverse_Expand {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the four digit number:");
		int data = sc.nextInt();

		int localdata = 0;
		if ((data%1000)>=0) {
			System.out.println("enterthe vaild four digits number");
		}

		while ((data) != 0) {
			int local = 0;
			local = data % 10;
			localdata = localdata * 10 + local;
			data = data / 10;

		}
		System.out.println(localdata);
		int num = localdata;
		int thousands = (num / 1000) * 1000;
		int hundreds = ((num / 100) % 10) * 100;
		int tens = ((num / 10) % 10) * 10;
		int ones = num % 10;

		System.out.println(thousands +" "+ hundreds + " " + tens + " " + ones);

	}

}
