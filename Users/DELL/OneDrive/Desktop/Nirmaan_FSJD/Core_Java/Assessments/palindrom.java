package Assessments;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "mam";
//		if (s.charAt(0) == s.charAt(2)) {
//			System.out.println("palindrom");
//		}
		Scanner sc = new Scanner(System.in);
		String Original = sc.nextLine();
		int l = Original.length();

//		for (int i = 0; i < l; i++) {
//			for (int j = l - 1; j <= 0; j--) {
//				if (Original.charAt(i) == Original.charAt(j)) {
//					System.out.println("this is palindrom");
//				} else {
//					System.out.println("Not a palindrom");
//				}
//			}
//		}
		for(int i=0;i<l/2;i++) {
			if(Original.charAt(i)==Original.charAt(l-1-i)) {
				System.out.println("panlindrom");
				break;
			}else {
				System.out.println("not a panlindrom");
			}
		}

	}

}
