package LeetCode;

import java.util.Scanner;

public class InvertedPyramid {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			
			for(int j=1;j<2*i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*(n-i)-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}