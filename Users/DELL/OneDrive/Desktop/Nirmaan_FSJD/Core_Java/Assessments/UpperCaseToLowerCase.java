package Assessments;

import java.util.Scanner;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char original = sc.next().charAt(0);
		int Convert= original+32;
		System.out.println(Convert);
		System.out.println((char)Convert);

	}

}
